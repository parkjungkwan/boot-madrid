package kr.scalar.api.bank.service;

import kr.scalar.api.bank.domain.AccountDTO;
import kr.scalar.api.util.service.*;
import java.util.ArrayList;
import java.util.List;

public class BankServiceImpl extends LambdaUtils implements BankService {

    private final List<AccountDTO> acounts;

    @Override
    public String count() {
        return string.apply(acounts.size());
    }

    @Override
    public List<? extends AccountDTO> findAll() {
        return acounts;
    }

    public BankServiceImpl(){
        acounts = new ArrayList<>();
    }

    @Override
    public void createAccount(AccountDTO account) {
        UtilService utilService = new UtilServiceImpl();
        String accountNumber = utilService.randomNumbers(4, false) +"-"+
                utilService.randomNumbers(4, true)+"-"+
                utilService.randomNumbers(4, true)
                ;
        account.setAccountNumber(accountNumber);
        account.setBalance("0");
        account.setDate(utilService.todayAndCurrentTime());
        account.setInterest("0.01");
        acounts.add(account);
    }

    @Override
    public String[] findAllAccountNumbers() {
        int count = strToInt.apply(count());
        String[] accountNumbers = new String[count];
        for(int i=0; i < count; i++){
            accountNumbers[i] = acounts.get(i).getAccountNumber();
        }
        return accountNumbers;
    }

    @Override
    public AccountDTO findAccountByAccountNumber(String accountNumber) {
        AccountDTO account = new AccountDTO();
        for(AccountDTO a: acounts){
            if(accountNumber.equals(a.getAccountNumber())){
                account = a;
                break;
            }
        }
        return account;
    }

    @Override
    public String findBalanceByAccountNumber(String accountnumber) {
        String balance = "";
        for(AccountDTO a: acounts){
            if( accountnumber.equals(a.getAccountNumber())){
                balance = a.getBalance();
                break;
            }
        }
        return balance;
    }
/* Database 이후 사용할 코드
    @Override
    public AccountDTO deposit(AccountDTO param) {
        AccountDTO account = findAccountByAccountNumber(param.getAccountNumber());
        int restMoney = strToInt.apply(account.getMoney());
        account.setMoney(restMoney + param.getMoney());
        for(AccountDTO a: acounts){
            if(a.getAccountNumber().equals(account.getAccountNumber())){
                a.setBalance(account.getMoney());
                account = a;
            }
        }
        return account;
    }

*/
    @Override
    public void deposit(AccountDTO param) {
        for(AccountDTO a: acounts){
            if(param.getAccountNumber().equals(a.getAccountNumber())){
                int balance = strToInt.apply(a.getBalance());
                a.setBalance(string.apply(balance + strToInt.apply(param.getMoney())));
                print.accept("입금 후 정보: "+a);
                break;
            }else{
                print.accept("해당 계좌가 존재하지 않습니다");
            }
        }
    }

    @Override
    public void withdraw(AccountDTO bank) {
    }

    @Override
    public void dropAccount(AccountDTO bank) {

    }
}

/*
 int balance = 0;

 public int deposit(int amount){
 balance += amount;
 return balance;
 }
 public int withdraw(int amount){
 balance -= amount;
 return balance;
 }
 public int checkMyBalance(){
 System.out.println("잔액 : " + balance);
 return balance;
 }
 * */

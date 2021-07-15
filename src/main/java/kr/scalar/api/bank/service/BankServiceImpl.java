package kr.scalar.api.bank.service;

import kr.scalar.api.bank.domain.AccountDTO;
import kr.scalar.api.util.service.*;
import java.util.ArrayList;
import java.util.List;

public class BankServiceImpl extends LambdaUtils implements BankService {

    private final AccountDTO bankAccount;
    private final List<AccountDTO> bankAcounts;

    @Override
    public String count() {
        return string.apply(bankAcounts.size());
    }

    @Override
    public List<?> findAll() {
        return bankAcounts;
    }

    public BankServiceImpl(){
        bankAccount = new AccountDTO();
        bankAcounts = new ArrayList<>();
    }

    @Override
    public void createAccount(AccountDTO bank) {
        UtilService utilService = new UtilServiceImpl();
        String accountNumber = utilService.randomNumbers(4, false) +"-"+
                utilService.randomNumbers(4, true)+"-"+
                utilService.randomNumbers(4, true)
                ;
        bank.setAccountNumber(accountNumber);
        bankAcounts.add(bank);
    }

    @Override
    public String[] findAllAccountNumbers() {
        int count = strToInt.apply(count());
        String[] accountNumbers = new String[count];
        for(int i=0; i < count; i++){
            accountNumbers[i] = bankAcounts.get(i).getAccountNumber();
        }
        return accountNumbers;
    }

    @Override
    public String findBalance(AccountDTO bank) {
        return bankAccount.getMoney();
    }

    @Override
    public String deposit(AccountDTO bank) {
        int restMoney = strToInt.apply(bankAccount.getMoney());
        bankAccount.setMoney(restMoney + bank.getMoney());
        return bankAccount.getMoney();
    }

    @Override
    public String withdraw(AccountDTO bank) {
        return "";
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

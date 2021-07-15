package kr.scalar.api.bank.service;

import kr.scalar.api.bank.domain.BankAccountDTO;
import kr.scalar.api.bicycle.domain.BicycleDTO;
import kr.scalar.api.dog.domain.DogDTO;
import org.springframework.beans.factory.annotation.Autowired;
import kr.scalar.api.util.service.*;
import java.util.ArrayList;
import java.util.List;

public class BankAccountServiceImpl extends LambdaUtils implements BankAccountService{

    private final BankAccountDTO bankAccount;
    private final List<BankAccountDTO> bankAcounts;

    @Override
    public String count() {
        return string.apply(bankAcounts.size());
    }

    @Override
    public List<?> findAll() {
        return bankAcounts;
    }

    public BankAccountServiceImpl(){
        bankAccount = new BankAccountDTO();
        bankAcounts = new ArrayList<>();
    }

    @Override
    public void createAccount(BankAccountDTO bank) {
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
    public String findBalance(BankAccountDTO bank) {
        return bankAccount.getMoney();
    }

    @Override
    public String deposit(BankAccountDTO bank) {
        int restMoney = strToInt.apply(bankAccount.getMoney());
        bankAccount.setMoney(restMoney + bank.getMoney());
        return bankAccount.getMoney();
    }

    @Override
    public String withdraw(BankAccountDTO bank) {
        return "";
    }

    @Override
    public void dropAccount(BankAccountDTO bank) {

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

package kr.scalar.api.bank.service;

import kr.scalar.api.bank.domain.BankAccountDTO;
import kr.scalar.api.bicycle.domain.BicycleDTO;
import kr.scalar.api.dog.domain.DogDTO;
import org.springframework.beans.factory.annotation.Autowired;
import kr.scalar.api.util.service.*;
import java.util.ArrayList;
import java.util.List;

public class BankAccountServiceImpl implements BankAccountService{

    private BankAccountDTO bankAccount;
    private List<BankAccountDTO> bankAcounts;

    @Override
    public int count() {
        return bankAcounts.size();
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
        String first = utilService.randomNumbers(4);
        //if(){}
        String accountNumber = first +"-"+
                utilService.randomNumbers(4)+"-"+
                utilService.randomNumbers(4)
                ;
        bank.setAccountNumber(accountNumber);
        bankAcounts.add(bank);
    }

    @Override
    public int findBalance(BankAccountDTO bank) {
        return bankAccount.getMoney();
    }

    @Override
    public int deposit(BankAccountDTO bank) {
        int restMoney = bankAccount.getMoney();
        bankAccount.setMoney(restMoney + bank.getMoney());
        return bankAccount.getMoney();
    }

    @Override
    public int withdraw(BankAccountDTO bank) {
        return 0;
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

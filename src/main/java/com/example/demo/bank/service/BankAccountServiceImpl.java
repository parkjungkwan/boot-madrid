package com.example.demo.bank.service;

import com.example.demo.bank.domain.BankAccountDTO;
import com.example.demo.bicycle.domain.BicycleDTO;
import com.example.demo.dog.domain.DogDTO;
import org.springframework.beans.factory.annotation.Autowired;

public class BankAccountServiceImpl implements BankAccountService{

    @Autowired private BankAccountDTO bankAccount;
    @Autowired private BankAccountDTO[] bankAcounts;

    @Override
    public void createAccount(BankAccountDTO bank) {
        bankAccount = new BankAccountDTO();
        String randomNumber = "";
        bankAccount.setAccountNumber(randomNumber);
        bankAccount.setName(bank.getName());
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

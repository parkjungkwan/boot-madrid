package com.example.demo.bank.service;

import com.example.demo.bank.domain.BankAccountDTO;

public class BankAccountServiceImpl implements BankAccountService{
    private BankAccountDTO bankAccount;

    @Override
    public void createAccount(BankAccountDTO bank) {
        bankAccount = new BankAccountDTO();
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

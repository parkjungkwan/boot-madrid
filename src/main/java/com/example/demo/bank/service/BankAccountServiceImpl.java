package com.example.demo.bank.service;

import com.example.demo.bank.domain.BankAccountDTO;

public class BankAccountServiceImpl implements BankAccountService{
    BankAccountDTO bankAccount = new BankAccountDTO();
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

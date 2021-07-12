package com.example.demo.bank.domain;

public class BankAccountDTO {
    private String name;
    private String accountNumber;
    private int money;
    private String bankName;
    private String date;
    private float interest;

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
}

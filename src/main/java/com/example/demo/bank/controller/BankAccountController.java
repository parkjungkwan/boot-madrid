package com.example.demo.bank.controller;

import com.example.demo.bank.domain.BankAccount;

public class BankAccountController {
    public static void main(String[] args) {
        // 두 개의 인스턴스 생성
        BankAccount Yoon = new BankAccount();
        BankAccount Park = new BankAccount();
        //각 인스턴스 대상으로 예금 진행
        Yoon.deposit(5000);
        Park.deposit(3000);
        //각 인스턴스 대상으로 출금 진행
        Yoon.withdraw(2000);
        Park.withdraw(2000);
        //각 인스턴스를 대상으로 잔액을 조회
        Yoon.checkMyBalance();
        Park.checkMyBalance();
    }
}

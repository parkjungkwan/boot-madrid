package com.example.demo.bank.service;

import com.example.demo.bank.domain.BankAccountDTO;

/**
 * * 은행이름은 상수로 정한다.
 이름, 금액, 계좌번호 을 입력한후 입금한 후 잔액을 확인한다
 이름, 금액, 계좌번호 을 입력한후 출금한 후 잔액을 확인한다
 이름, 금액, 계좌번호 을 입력한후 잔액을 확인하면 잔액이 보인다.
 이름을 입력하면 계좌가 생성된다
 이름, 계좌번호 을 입력한후 계좌를 해지한다.



 * */
public interface BankAccountService {

    void createAccount(BankAccountDTO bank);
    int findBalance(BankAccountDTO bank);
    int deposit(BankAccountDTO bank);
    int withdraw(BankAccountDTO bank);
    void dropAccount(BankAccountDTO bank);
}

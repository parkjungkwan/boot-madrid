package kr.scalar.api.bank.controller;

import kr.scalar.api.bank.domain.AccountDto;
import kr.scalar.api.bank.service.*;
import kr.scalar.api.util.service.LambdaUtils;

import java.util.List;
import java.util.Scanner;


public class BankController extends LambdaUtils {
    private final BankService bankService;
    public BankController(){
        bankService = new BankServiceImpl();
    }
    public void main() {
        Scanner scanner = new Scanner(System.in);
        AccountDto account = null;
        while(true){
            System.out.println("[MENU] 0-Exit 1-계좌개설 2-계좌목록 3-계좌번호목록 \n" +
                    " 4-잔고확인 5-입금 6-출금");
            switch (scanner.next()){
                case "0": return;
                case "1":
                    account = new AccountDto();
                    print.accept("이름: ");
                    account.setName(scanner.next());
                    bankService.createAccount(account);
                    break;
                case "2":
                    print.accept("개설된 계좌 수: "+bankService.count());
                    List<? extends AccountDto> list = bankService.findAll();
                    for(AccountDto a: list){
                        print.accept(a.toString());
                    }
                    break;
                case "3":
                    for(String s: bankService.findAllAccountNumbers()){
                        print.accept(s + "\n");
                    }
                    break;
                case "4":
                    print.accept("잔고 조회할 계좌번호 : ");
                    print.accept(bankService.findBalanceByAccountNumber(scanner.next()));
                    break;
                case "5":
                    print.accept("입금 할 계좌번호 : ");
                    account = new AccountDto();
                    account.setAccountNumber(scanner.next());
                    print.accept("입금액 : ");
                    account.setMoney(scanner.next());
                    bankService.deposit(account);
                    break;
                case "6":
                    print.accept("출금 할 계좌번호 : ");
                    account = new AccountDto();
                    account.setAccountNumber(scanner.next());
                    print.accept("출금액 : ");
                    account.setMoney(scanner.next());
                    break;



            }
        }


        /*
        //각 인스턴스 대상으로 예금 진행
        Yoon.deposit(5000);
        Park.deposit(3000);
        //각 인스턴스 대상으로 출금 진행
        Yoon.withdraw(2000);
        Park.withdraw(2000);
        //각 인스턴스를 대상으로 잔액을 조회
        Yoon.checkMyBalance();
        Park.checkMyBalance(); */
    }
}

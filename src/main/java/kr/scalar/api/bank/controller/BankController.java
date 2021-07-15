package kr.scalar.api.bank.controller;

import kr.scalar.api.bank.domain.AccountDTO;
import kr.scalar.api.bank.service.*;
import kr.scalar.api.util.service.LambdaUtils;

import java.util.Scanner;


public class BankController extends LambdaUtils {
    private BankService bankService;
    public BankController(){
        bankService = new BankServiceImpl();
    }
    public void main() {
        Scanner scanner = new Scanner(System.in);
        AccountDTO account = null;
        while(true){
            System.out.println("[Memu] 0-Exit 1-계좌개설 2-계좌목록 3-계좌번호목록 4-입금");
            switch (scanner.next()){
                case "0": return;
                case "1":
                    account = new AccountDTO();
                    System.out.println("이름 : [   ]");
                    account.setName(scanner.next());
                    bankService.createAccount(account);
                    break;
                case "2":
                    System.out.println("개설된 계좌 수: "+bankService.count());
                    System.out.println(bankService.findAll());
                    break;
                case "3":
                    for(String s: bankService.findAllAccountNumbers()){
                        System.out.println(s + "\n");
                    }
                    break;
                case "4":
                    System.out.println("계좌번호 : [   ]");
                    account = new AccountDTO();
                    account.setAccountNumber(scanner.next());
                    System.out.println("입금액 : [   ]");
                    account.setMoney(scanner.next());

                    
                    break;
                case "5": break;
                case "6": break;

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

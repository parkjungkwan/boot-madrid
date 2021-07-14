package kr.scalar.api.bank.controller;

import kr.scalar.api.bank.domain.BankAccountDTO;
import kr.scalar.api.bank.service.BankAccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;


public class BankAccountController {
    private BankAccountServiceImpl bankAccountService;
    public BankAccountController(){
        bankAccountService = new BankAccountServiceImpl();
    }
    public void main() {
        Scanner scanner = new Scanner(System.in);
        BankAccountDTO account = null;
        while(true){
            System.out.println("[Memu] 0-Exit 1-계좌개설 2-계좌목록");
            switch (scanner.next()){
                case "0": return;
                case "1":
                    account = new BankAccountDTO();
                    System.out.println("이름 : [   ]");
                    account.setName(scanner.next());
                    bankAccountService.createAccount(account);
                    break;
                case "2":
                    System.out.println("개설된 계좌 수: "+bankAccountService.count());
                    System.out.println(bankAccountService.findAll());
                    break;
                case "3": break;
                case "4": break;
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

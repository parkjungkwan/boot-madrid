package kr.scalar.api.himart.controller;


import kr.scalar.api.bank.domain.AccountDTO;
import kr.scalar.api.bank.service.*;
import kr.scalar.api.himart.service.HimartService;
import kr.scalar.api.himart.service.HimartServiceImpl;
import kr.scalar.api.util.service.LambdaUtils;

import java.util.List;
import java.util.Scanner;


public class HimartController extends LambdaUtils {
    private final HimartService himartService;
    public HimartController(){
        himartService = new HimartServiceImpl();
    }
    public void main() {
        Scanner scanner = new Scanner(System.in);
        AccountDTO account = null;
        while(true){
            System.out.println("[MENU] 0-Exit 1-스마트폰 2- 3- \n" +
                    " 4- 5- 6-");
            switch (scanner.next()){
                case "0": return;
                case "1":
                    phoneMain(scanner);
                    break;
                case "2":

                    break;
                case "3":

                    break;
                case "4":

                    break;
                case "5":

                    break;
                case "6":
                    
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
    public void phoneMain(Scanner scanner){
        while(true){
            print.accept("[Menu] 0-종료 1-집전화 2-휴대폰 3-아이폰 4-갤럭시");
            switch (scanner.next()){
                case "0": return;
                case "1": break;
                case "2": break;
                case "3": break;
            }
        }
    }
}

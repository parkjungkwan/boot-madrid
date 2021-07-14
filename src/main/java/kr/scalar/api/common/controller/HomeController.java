package kr.scalar.api.common.controller;

import kr.scalar.api.bank.controller.BankAccountController;
import kr.scalar.api.bicycle.controller.BicycleController;
import kr.scalar.api.dog.controller.DogController;
import kr.scalar.api.dog.domain.DogDTO;
import kr.scalar.api.dog.service.DogService;
import kr.scalar.api.dog.service.DogServiceImpl;
import kr.scalar.api.math.controller.CalculatorController;
import kr.scalar.api.util.controller.UtilController;

import java.util.Scanner;

public class HomeController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DogController dogController = new DogController();
        while(true){
            System.out.println("\n[메뉴] 0.종료 1.계산기 2.수열 3.개등록 33.개목록 4.자전거정보 5.오늘날짜 6.비트은행");
            switch (scanner.next()){
                case "0": return;
                case "1": new CalculatorController().calculate();break;
                case "2": new CalculatorController().sequence();break;
                case "3":
                    DogDTO dog = new DogDTO();
                    System.out.println("이름이 무엇입니까?");
                    dog.setName(scanner.next());
                    System.out.println("색깔은 무엇입니까?");
                    dog.setColor(scanner.next());
                    System.out.println("품종은 무엇입니까?");
                    dog.setBreed(scanner.next());
                    dogController.add(dog);
                    break;
                case "33":
                    dogController.show();
                    break;
                case "4": new BicycleController().main();break;
                case "5": new UtilController().todayAndCurrentTime();break;
                case "6": new BankAccountController().main();break;

            }
        }
    }
}
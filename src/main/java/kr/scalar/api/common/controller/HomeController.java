package kr.scalar.api.common.controller;

import kr.scalar.api.bank.controller.BankController;
import kr.scalar.api.bicycle.controller.BicycleController;
import kr.scalar.api.dog.controller.DogController;
import kr.scalar.api.math.controller.MathController;
import kr.scalar.api.util.controller.UtilController;

import java.util.Scanner;

public class HomeController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DogController dogController = new DogController();
        while(true){
            System.out.println("\n[메뉴] 0.종료 1.유틸 2.계산기 3.개 4.자전거 6.은행 7.하이마트");
            switch (scanner.next()){
                case "0": return;
                case "1": new UtilController().main();break;
                case "2": new MathController().main();break;
                case "3": new DogController.main(); break;
                case "4": new BicycleController().main();break;
                case "6": new BankController().main();break;

            }
        }
    }
}

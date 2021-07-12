package com.example.demo.common.controller;

import com.example.demo.bicycle.controller.BicycleController;
import com.example.demo.dog.controller.DogController;
import com.example.demo.math.controller.CalculatorController;
import com.example.demo.util.controller.UtilController;
import com.example.demo.util.service.UtilService;
import com.example.demo.util.service.UtilServiceImpl;

import java.util.Scanner;

public class HomeController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorController calculatorController = new CalculatorController();
        UtilController utilController = new UtilController();
        DogController dogController = new DogController();
        BicycleController bicycleController = new BicycleController();

        while(true){
            System.out.println("\n[메뉴] 0.종료 1.계산기 2.수열 3.개정보 4.자전거정보 5.오늘날짜");
            switch (scanner.next()){
                case "0": return;
                case "1": calculatorController.calculate();break;
                case "2": calculatorController.sequence();break;
                case "3": dogController.main();break;
                case "4": bicycleController.main();break;
                case "5": utilController.todayAndCurrentTime();break;

            }
        }
    }
}

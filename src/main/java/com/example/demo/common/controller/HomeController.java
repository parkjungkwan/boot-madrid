package com.example.demo.common.controller;

import com.example.demo.bank.controller.BankAccountController;
import com.example.demo.bicycle.controller.BicycleController;
import com.example.demo.dog.controller.DogController;
import com.example.demo.dog.domain.DogDTO;
import com.example.demo.dog.service.DogServiceImpl;
import com.example.demo.math.controller.CalculatorController;
import com.example.demo.util.controller.UtilController;
import com.example.demo.util.service.UtilService;
import com.example.demo.util.service.UtilServiceImpl;

import java.util.Scanner;

public class HomeController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("\n[메뉴] 0.종료 1.계산기 2.수열 3.개정보 4.자전거정보 5.오늘날짜");
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
                    DogController dogController = new DogController(new DogServiceImpl(dog));
                    System.out.println(dogController.barking("왈왈"));
                    break;
                case "4": new BicycleController().main();break;
                case "5": new UtilController().todayAndCurrentTime();break;

            }
        }
    }
}

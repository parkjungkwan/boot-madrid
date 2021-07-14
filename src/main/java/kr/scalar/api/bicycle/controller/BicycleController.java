package kr.scalar.api.bicycle.controller;

import kr.scalar.api.bicycle.domain.BicycleDTO;
import kr.scalar.api.bicycle.service.BicycleService;
import kr.scalar.api.bicycle.service.BicycleServiceImpl;

import java.util.Scanner;

public class BicycleController {

    private BicycleService bicycleService;
    private BicycleDTO bicycle;
    private Scanner scanner;

    public BicycleController(){
        this.bicycleService = new BicycleServiceImpl();
        this.bicycle = new BicycleDTO();
        this.scanner = new Scanner(System.in);
    }

    public void main() {

        BicycleDTO bicycle = new BicycleDTO();
        System.out.println("기어가 몇단 입니까?");
        bicycle.setGear(scanner.nextInt());
        System.out.println("페달은 무엇입니까?");
        bicycle.setPedal(scanner.next());
        System.out.println("속도는 얼마입니까?");
        bicycle.setSpeed(scanner.nextInt());
        System.out.print(bicycle.toString());

    }
}

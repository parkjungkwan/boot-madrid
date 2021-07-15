package kr.scalar.api.bicycle.controller;

import kr.scalar.api.bicycle.domain.BicycleDTO;
import kr.scalar.api.bicycle.service.BicycleService;
import kr.scalar.api.bicycle.service.BicycleServiceImpl;
import kr.scalar.api.util.service.LambdaUtils;

import java.util.List;
import java.util.Scanner;

public class BicycleController extends LambdaUtils {

    private BicycleService bicycleService;

    public BicycleController(){
        bicycleService = new BicycleServiceImpl();
    }

    public void main() {
        Scanner scanner = new Scanner(System.in);
        BicycleDTO bicycle = null;
        while(true){
            print.accept("\n[메뉴] 0-종료 1-등록 2-목록\n");
            switch (scanner.next()){
                case "0": return;
                case "1":
                    bicycle = new BicycleDTO();
                    print.accept("기어가 몇단 입니까? ");
                    bicycle.setGear(scanner.next());
                    print.accept("페달은 무엇입니까? ");
                    bicycle.setPedal(scanner.next());
                    print.accept("속도는 얼마입니까? ");
                    bicycle.setSpeed(scanner.next());
                    bicycleService.add(bicycle);
                    break;
                case "2":
                    List<? extends BicycleDTO> list = bicycleService.show();
                    for(BicycleDTO b : list){
                        print.accept(b.toString());
                    }
            }
        }


    }
}

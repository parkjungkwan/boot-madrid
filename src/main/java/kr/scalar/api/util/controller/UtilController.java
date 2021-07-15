package kr.scalar.api.util.controller;

import kr.scalar.api.util.service.LambdaUtils;
import kr.scalar.api.util.service.UtilService;
import kr.scalar.api.util.service.UtilServiceImpl;

import java.util.Scanner;

public class UtilController extends LambdaUtils {

    private UtilService utilService;

    public UtilController(){
        this.utilService = new UtilServiceImpl();
    }
    public void main(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            print.accept("[메뉴] 0-종료 1-현재 날짜,시간");
            switch (scanner.next()){
                case "0": return;
                case "1": print.accept(utilService.todayAndCurrentTime()); break;
            }
        }

    }
}

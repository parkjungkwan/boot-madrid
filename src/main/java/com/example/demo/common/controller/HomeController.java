package com.example.demo.common.controller;

import java.util.Scanner;

public class HomeController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("\n[메뉴] 0.종료 1.계산기 2.수열 ");
            switch (scanner.next()){
                case "0": return;
                case "1":
                    System.out.println("실행");
                    break;

            }
        }
    }
}

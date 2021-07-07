package com.example.demo.math.controller;

public class GugudanController {
    public static void main(String[] args) {


        for (int j = 1; j <= 9; j++) {
            //System.out.println('\n');
            // System.out.println(i+"단 입니다.");
            for (int i = 2; i < 6; i++) {
                //System.out.print(j +"단");
                System.out.print(i + " * " + j + " = " + i * j + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int j = 1; j <= 9; j++) {
            //System.out.println('\n');
            // System.out.println(i+"단 입니다.");
            for (int i = 6; i < 10; i++) {
                //System.out.print(j +"단");
                System.out.print(i + " * " + j + " = " + i * j + "\t");
            }
            System.out.println();
        }
    }

}

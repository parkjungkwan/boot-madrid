package kr.scalar.api.math.controller;

import kr.scalar.api.math.domain.CalculatorDTO;
import kr.scalar.api.math.service.CalculatorService;
import kr.scalar.api.math.service.CalculatorServiceImpl;

import java.util.Scanner;

public class CalculatorController {
    Scanner scanner = new Scanner(System.in);
    CalculatorDTO calculator = new CalculatorDTO();
    CalculatorService calculatorService = new CalculatorServiceImpl();

    public void calculate(){
        System.out.println("숫자 1");
        calculator.setNum1(scanner.nextInt());
        System.out.println("연산자");
        calculator.setOpcode(scanner.next());
        System.out.println("숫자 2");
        calculator.setNum2(scanner.nextInt());
        int result = 0;
        switch (calculator.getOpcode()){
            case "+": result = calculatorService.add(calculator);
                break;
            case "-": result = calculatorService.subtract(calculator);
                break;
            case "*": result = calculatorService.multiple(calculator);
                break;
            case "/": result = calculatorService.divide(calculator);
                break;
            case "%": result = calculatorService.remain(calculator);
                break;
        }
        System.out.printf("%d %s %d = %d",
                calculator.getNum1(),
                calculator.getOpcode(),
                calculator.getNum2(),
                result);
    }
    public void sequence(){
        System.out.println("수열의 시작값:");
        calculator.setNum1(scanner.nextInt());
        System.out.println("수열의 마지막값:");
        calculator.setNum2(scanner.nextInt());
        int[] arr = calculatorService.sequence(calculator);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+"\t");
        }
    }
}

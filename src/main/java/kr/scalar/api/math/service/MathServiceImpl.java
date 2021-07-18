package kr.scalar.api.math.service;

import kr.scalar.api.math.domain.MathDTO;
import kr.scalar.api.math.repository.MathRepository;

public class MathServiceImpl implements MathService {

    private MathRepository mathRepository;

    public void setMathRepository(MathRepository mathRepository){
        this.mathRepository = mathRepository;
    }

    @Override
    public int add(MathDTO calculator) {
        return calculator.getNum1() + calculator.getNum2();
    }

    @Override
    public int subtract(MathDTO calculator) {
        return calculator.getNum1() - calculator.getNum2();
    }

    @Override
    public int multiple(MathDTO calculator) {
        return calculator.getNum1() * calculator.getNum2();
    }

    @Override
    public int divide(MathDTO calculator) {
        return calculator.getNum1() / calculator.getNum2();
    }

    @Override
    public int remain(MathDTO calculator) {
        return calculator.getNum1() % calculator.getNum2();
    }

    @Override
    public int calculateSumUsingDataService() {
        int sum = 0;
        int[] data = mathRepository.findAll();
        for(int value: data){
            sum += value;
        }
        return sum;
    }

    @Override
    public int[] sequence(MathDTO calculator) {
        int count = calculator.getNum2() - calculator.getNum1() + 1;
        int[] arr = new int[count];
        int i = 0;
        for(int j=calculator.getNum1(); j <=calculator.getNum2(); j++){
            arr[i] = j;
            i++;
        }
        return arr;
    }


}


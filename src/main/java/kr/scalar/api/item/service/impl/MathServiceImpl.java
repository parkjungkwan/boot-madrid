package kr.scalar.api.item.service.impl;

import kr.scalar.api.item.domain.MathDto;
import kr.scalar.api.item.repository.MathRepository;
import kr.scalar.api.item.service.MathService;

public class MathServiceImpl implements MathService {

    private MathRepository mathRepository;

    public void setMathRepository(MathRepository mathRepository){
        this.mathRepository = mathRepository;
    }

    @Override
    public int add(MathDto calculator) {
        return calculator.getNum1() + calculator.getNum2();
    }

    @Override
    public int subtract(MathDto calculator) {
        return calculator.getNum1() - calculator.getNum2();
    }

    @Override
    public int multiple(MathDto calculator) {
        return calculator.getNum1() * calculator.getNum2();
    }

    @Override
    public int divide(MathDto calculator) {
        return calculator.getNum1() / calculator.getNum2();
    }

    @Override
    public int remain(MathDto calculator) {
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
    public int[] sequence(MathDto calculator) {
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


package kr.scalar.api.math.service;

import kr.scalar.api.math.domain.CalculatorDTO;

public interface CalculatorService {
    int add(CalculatorDTO calculator);
    int subtract(CalculatorDTO calculator);
    int multiple(CalculatorDTO calculator);
    int divide(CalculatorDTO calculator);
    int remain(CalculatorDTO calculator);
    int[] sequence(CalculatorDTO calculator);


}

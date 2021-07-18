package kr.scalar.api.math.service;

import kr.scalar.api.math.domain.MathDTO;

public interface MathService {
    int add(MathDTO calculator);
    int subtract(MathDTO calculator);
    int multiple(MathDTO calculator);
    int divide(MathDTO calculator);
    int remain(MathDTO calculator);
    int[] sequence(MathDTO calculator);
    int calculateSumUsingDataService();


}

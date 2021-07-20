package kr.scalar.api.item.service;

import kr.scalar.api.item.domain.MathDto;

public interface MathService {
    int add(MathDto calculator);
    int subtract(MathDto calculator);
    int multiple(MathDto calculator);
    int divide(MathDto calculator);
    int remain(MathDto calculator);
    int[] sequence(MathDto calculator);
    int calculateSumUsingDataService();


}

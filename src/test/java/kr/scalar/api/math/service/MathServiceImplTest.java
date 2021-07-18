package kr.scalar.api.math.service;

import kr.scalar.api.math.domain.MathDTO;
import kr.scalar.api.math.repository.MathRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
class MathServiceImplTest {
    @InjectMocks
    MathServiceImpl mathService = new MathServiceImpl();
    @Mock
    MathRepository mathRepository;



    @Test
    void setMathRepository() {
    }

    @Test
    void add() {
        MathServiceImpl service = new MathServiceImpl();
        MathDTO math = new MathDTO();
        math.setNum1(4);
        math.setNum2(8);
        int actualResult = service.add(math);
        int expectedResult = 12;
        assertEquals(expectedResult, actualResult);

    }

    @Test
    void subtract() {
    }

    @Test
    void multiple() {
    }

    @Test
    void divide() {
    }

    @Test
    void remain() {
    }

    @Test
    void calculateSumUsingDataService() {
        when(mathRepository.findAll()).thenReturn(new int[]{1,2,3});
        assertEquals(6, mathService.calculateSumUsingDataService());
    }

    @Test
    void sequence() {
    }
}
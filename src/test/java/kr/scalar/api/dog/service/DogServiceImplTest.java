package kr.scalar.api.dog.service;
// Chap 14 Introduction Spy
import kr.scalar.api.dog.domain.DogDTO;
import kr.scalar.api.dog.repository.DogRepository;
import kr.scalar.api.math.repository.MathRepository;
import kr.scalar.api.math.service.MathServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(SpringExtension.class)
class DogServiceImplTest {
    @InjectMocks
    DogServiceImpl dogService = new DogServiceImpl();
    @Mock
    DogRepository dogRepository;

    List<DogDTO> mock = mock(List.class);

    @Test
    void add() {
        mock.add(new DogDTO("zzang","black","buldog"));
        ArgumentCaptor<DogDTO> captor = ArgumentCaptor.forClass(DogDTO.class);
        verify(mock).add(captor.capture());
        assertEquals("zzang", captor.getValue().getName());
    }
    @Test
    void addMultiple() {
        mock.add(new DogDTO("zzang","black","buldog"));
        mock.add(new DogDTO("mary","white","mix"));
        ArgumentCaptor<DogDTO> captor = ArgumentCaptor.forClass(DogDTO.class);
        verify(mock, times(2)).add(captor.capture());
        List<DogDTO> allDogs = captor.getAllValues();
        assertEquals("buldog", allDogs.get(0).getBreed());
        assertEquals("mix", allDogs.get(1).getBreed());
    }

    @Test
    void count() {
    }

    @Test
    void findAll() {

    }

    @Test
    void findOne() {
        when(mock.get(anyInt())).thenReturn(new DogDTO("harry","yellow","retriever"));
        assertEquals("harry", mock.get(0).getName());
    }

    @Test
    void findByColor() {
        DogDTO retriever = mock.get(0);
        DogDTO jindo = mock.get(1);


        verify(mock).get(0);
        verify(mock, times(2)).get(anyInt());
        verify(mock, atLeast(1)).get(anyInt());
        verify(mock, atLeastOnce()).get(anyInt());
        verify(mock, atMost(2)).get(anyInt());
        verify(mock, never()).get(2);
    }

    @Test
    void findByBreed() {
    }
}
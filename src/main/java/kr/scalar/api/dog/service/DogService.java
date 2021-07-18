package kr.scalar.api.dog.service;

import kr.scalar.api.dog.domain.DogDTO;
import java.util.List;

// barking, fetching, wagging tail
public interface DogService {
    void add(DogDTO dog);
    int count();
    List<? extends DogDTO> findAll();
    DogDTO findOne(String name);
    List<? extends DogDTO> findByColor(String color);
    List<? extends DogDTO> findByBreed(String breed);
}

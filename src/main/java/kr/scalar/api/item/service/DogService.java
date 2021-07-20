package kr.scalar.api.item.service;

import kr.scalar.api.item.domain.DogDto;
import java.util.List;

// barking, fetching, wagging tail
public interface DogService {
    void add(DogDto dog);
    int count();
    List<? extends DogDto> findAll();
    DogDto findOne(String name);
    List<? extends DogDto> findByColor(String color);
    List<? extends DogDto> findByBreed(String breed);
}

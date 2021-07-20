package kr.scalar.api.item.service.impl;

import kr.scalar.api.item.service.DogService;
import org.springframework.stereotype.Service;
import kr.scalar.api.item.domain.DogDto;
import java.util.ArrayList;
import java.util.List;


@Service
public class DogServiceImpl implements DogService {

    private final List<DogDto> dogs;

    public DogServiceImpl(){
        dogs = new ArrayList<>();
    }

    @Override
    public void add(DogDto dog) {
        dogs.add(dog);
    }

    @Override
    public int count() {
        return dogs.size();
    }

    @Override
    public List<? extends DogDto> findAll() {
        return dogs;
    }

    @Override
    public DogDto findOne(String name) {
        DogDto dog = new DogDto();
        return dog;
    }
    @Override
    public List<? extends DogDto> findByColor(String color) {
        List<? extends DogDto> dogsOfSameColor = new ArrayList<>();
        return dogsOfSameColor;
    }

    @Override
    public List<? extends DogDto> findByBreed  (String breed){
        List<? extends DogDto> dogsOfSameBreed = new ArrayList<>();
        return dogsOfSameBreed;
    }
}

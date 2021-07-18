package kr.scalar.api.dog.service;

import org.springframework.stereotype.Service;
import kr.scalar.api.dog.domain.DogDTO;
import java.util.ArrayList;
import java.util.List;


@Service
public class DogServiceImpl implements DogService{

    private final List<DogDTO> dogs;

    public DogServiceImpl(){
        dogs = new ArrayList<>();
    }

    @Override
    public void add(DogDTO dog) {
        dogs.add(dog);
    }

    @Override
    public int count() {
        return dogs.size();
    }

    @Override
    public List<? extends DogDTO> findAll() {
        return dogs;
    }

    @Override
    public DogDTO findOne(String name) {
        DogDTO dog = new DogDTO();
        return dog;
    }
    @Override
    public List<? extends DogDTO> findByColor(String color) {
        List<? extends DogDTO> dogsOfSameColor = new ArrayList<>();
        return dogsOfSameColor;
    }

    @Override
    public List<? extends DogDTO> findByBreed  (String breed){
        List<? extends DogDTO> dogsOfSameBreed = new ArrayList<>();
        return dogsOfSameBreed;
    }
}

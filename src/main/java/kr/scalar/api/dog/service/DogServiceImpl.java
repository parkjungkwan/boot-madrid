package kr.scalar.api.dog.service;


import kr.scalar.api.bicycle.domain.BicycleDTO;
import org.springframework.stereotype.Service;
import kr.scalar.api.dog.domain.DogDTO;
import java.util.ArrayList;
import java.util.List;


@Service
public class DogServiceImpl implements DogService{

    private final DogDTO dog;
    private final List<DogDTO> dogs;

    public DogServiceImpl(){
        dog = new DogDTO();
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
    public String barking(String bark) {
        return dog.toString()+ bark +" 짖는다";
    }
    @Override
    public String fetching(String target) {
        return dog.toString()+ target +"을 물어온다";
    }

    @Override
    public String waggingTail() {
        return " 꼬리를 흔든다";
    }
}

package kr.scalar.api.dog.controller;

import kr.scalar.api.dog.domain.DogDTO;
import kr.scalar.api.dog.service.DogService;
import kr.scalar.api.dog.service.DogServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class DogController{

    private DogService dogService;

    public DogController(){
        dogService = new DogServiceImpl();
    }

    public void add(DogDTO dog){
        dogService.add(dog);
    }


    public int count() {
        return dogService.count();
    }

    public void show(){
        System.out.println("강아지의 수 : "+ dogService.count());
        System.out.println(dogService.show());
    }

    public String barking(String bark) {
        return dogService.barking(bark);
    }

    public String fetching(String target) {
        return dogService.fetching(target);
    }

    public String waggingTail() {
        return dogService.waggingTail();
    }
}

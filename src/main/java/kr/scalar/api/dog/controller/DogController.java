package kr.scalar.api.dog.controller;

import kr.scalar.api.dog.domain.DogDTO;
import kr.scalar.api.dog.service.DogService;
import kr.scalar.api.dog.service.DogServiceImpl;
import kr.scalar.api.util.service.LambdaUtils;
import java.util.List;
import java.util.Scanner;

public class DogController extends LambdaUtils {
    private DogService dogService;
    public DogController(){
        dogService = new DogServiceImpl();
    }

    public void main(){
        Scanner scanner = new Scanner(System.in);
        DogDTO dog = null;
        while(true){
            print.accept("\n[메뉴]: 0-종료 1-추가 2-카운트 3-목록\n");
            switch (scanner.next()){
                case "0": return;
                case "1":
                    dog = new DogDTO();
                    print.accept("품종:");
                    dog.setBreed(scanner.next());
                    print.accept("이름:");
                    dog.setName(scanner.next());
                    print.accept("색깔:");
                    dog.setColor(scanner.next());
                    dogService.add(dog);
                case "2":
                    print.accept(string.apply(dogService.count()));
                    break;
                case "3":
                    List<DogDTO> list =  (List<DogDTO>)dogService.show();
                    for(DogDTO d : list){
                        print.accept(d.toString());
                    }
                    break;

            }
        }
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

package kr.scalar.api.item.controller;

import kr.scalar.api.item.domain.DogDto;
import kr.scalar.api.item.service.DogService;
import kr.scalar.api.item.service.impl.DogServiceImpl;
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
        DogDto dog = null;
        while(true){
            print.accept("\n[메뉴]: 0-종료 1-추가 2-카운트 3-목록\n");
            switch (scanner.next()){
                case "0": return;
                case "1":
                    dog = new DogDto();
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
                    List<? extends DogDto> list =  dogService.findAll();
                    for(DogDto d : list){ print.accept(d.toString());}
                    break;

            }
        }
    }


}

package com.example.demo.dog.domain;

// state (name, color, breed, hungry) and behavior (barking, fetching, wagging tail).
import lombok.Data;
import org.springframework.stereotype.Component;
import java.util.Scanner;
@Data
public class DogDTO {
    private String name;
    private String color;
    private String breed;

    @Override
    public String toString() {
        return String.format("이름은 %s이고, 색깔은 %s이고, 품종은 %s인 강아지가 ",name, color, breed);
    }
}


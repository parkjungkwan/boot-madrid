package com.example.demo.dog.domain;

// state (name, color, breed, hungry) and behavior (barking, fetching, wagging tail).
import java.util.Scanner;

public class Dog{
    private String name;
    private String color;
    private String breed;
    private String hungry;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public String getBreed(){
        return this.breed;
    }
    public void setHungry(String hungry){
        this.hungry = hungry;
    }
    public String getHungry(){
        return this.hungry;
    }

    @Override
    public String toString() {
        return String.format("이름은 %s이고, 색깔은 %s이고, 품종은 %s이고, 배고픔은 %s입니다.",name, color, breed, hungry);
    }
}


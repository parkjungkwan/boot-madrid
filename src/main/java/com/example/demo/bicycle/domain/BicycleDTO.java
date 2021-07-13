package com.example.demo.bicycle.domain;

import lombok.Data;

@Data
public class BicycleDTO {

    private int gear;
    private String pedal;
    private int speed;



    @Override
    public String toString() {
        return String.format("기어 : %d단 \n페달 : %s\n스피드 : %dkm",gear,pedal,speed);
    }
}

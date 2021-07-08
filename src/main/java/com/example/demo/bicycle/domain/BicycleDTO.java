package com.example.demo.bicycle.domain;

public class BicycleDTO {

    private int gear;
    private String pedal;
    private int speed;

    public void setGear(int gear){
        this.gear = gear;
    }
    public int getGear(){
        return this.gear;
    }
    public void setPedal(String pedal){
        this.pedal = pedal;
    }
    public String getPedal(){
        return this.pedal;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public int getSpeed(){
        return this.speed;
    }

    @Override
    public String toString() {
        return String.format("기어 : %d단 \n페달 : %s\n스피드 : %dkm",gear,pedal,speed);
    }
}

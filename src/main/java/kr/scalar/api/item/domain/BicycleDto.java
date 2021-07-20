package kr.scalar.api.item.domain;

import lombok.Data;

@Data
public class BicycleDto {

    private String gear;
    private String pedal;
    private String speed;

    @Override
    public String toString() {
        return String.format("기어 : %s 단 \n페달 : %s\n스피드 : %s km",gear,pedal,speed);
    }
}

package kr.scalar.api.dog.domain;

// state (name, color, breed, hungry) and behavior (barking, fetching, wagging tail).
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.Scanner;
@Data
@NoArgsConstructor
public class DogDTO {
    private String name;
    private String color;
    private String breed;

    public DogDTO(String name, String color, String breed){
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return String.format("이름은 %s이고, 색깔은 %s이고, 품종은 %s인 강아지 ",name, color, breed);
    }
}


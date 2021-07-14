package kr.scalar.api.util.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
@Data
public class UtilDTO {
    private LocalDate today;
    private LocalTime currentTime;

}

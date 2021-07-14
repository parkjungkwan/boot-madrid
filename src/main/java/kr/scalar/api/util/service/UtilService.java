package kr.scalar.api.util.service;

import java.time.LocalDate;
import java.time.LocalTime;

public interface UtilService {
    LocalDate today();
    LocalTime currentTime();
    String todayAndCurrentTime();
    String randomNumbers(int digits, boolean allowZeroValue);
}

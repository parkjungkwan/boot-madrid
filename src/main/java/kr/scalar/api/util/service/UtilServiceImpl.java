package kr.scalar.api.util.service;

import kr.scalar.api.util.domain.UtilDTO;

import java.time.LocalDate;
import java.time.LocalTime;

public class UtilServiceImpl implements UtilService{
    @Override
    public String randomNumbers(int digits) {
        return null;
    }

    private UtilDTO util;

    public UtilServiceImpl(){
        this.util = new UtilDTO();
    }

    @Override
    public String todayAndCurrentTime() {
        return String.format("%s %s", today(), currentTime() );
    }

    @Override
    public LocalDate today() {
        util.setToday(LocalDate.now());
        return util.getToday();
    }

    @Override
    public LocalTime currentTime() {
        util.setCurrentTime(LocalTime.now());
        return util.getCurrentTime();
    }


}

package com.example.demo.util.service;

import com.example.demo.util.domain.UtilDTO;

import java.time.LocalDate;
import java.time.LocalTime;

public class UtilServiceImpl implements UtilService{

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

package kr.scalar.api.util.service;

import kr.scalar.api.util.domain.UtilDTO;

import java.time.LocalDate;
import java.time.LocalTime;

public class UtilServiceImpl implements UtilService{
    @Override
    public String randomNumbers(int digits) {
        // Math.random() 클래스 메소드
        // Random random = new Raddom()
        // random.nextInt(1000); 인스턴스 메소드
        String result = "";
        for(int i=0; i<digits; i++){
            result += (int) (Math.random() * 10);
        }
        return result;
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

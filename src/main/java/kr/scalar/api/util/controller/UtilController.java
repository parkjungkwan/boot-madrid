package kr.scalar.api.util.controller;

import kr.scalar.api.util.service.UtilService;
import kr.scalar.api.util.service.UtilServiceImpl;

public class UtilController {

    private UtilService utilService = new UtilServiceImpl();

    public void todayAndCurrentTime(){
        System.out.println(utilService.todayAndCurrentTime());
    }
}

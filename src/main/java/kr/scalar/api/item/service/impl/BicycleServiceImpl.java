package kr.scalar.api.item.service.impl;

import kr.scalar.api.item.domain.BicycleDto;
import kr.scalar.api.item.service.BicycleService;

import java.util.ArrayList;
import java.util.List;

public class BicycleServiceImpl implements BicycleService {
    private final List<BicycleDto> bicycles;

    public BicycleServiceImpl(){
        bicycles = new ArrayList<>();
    }

    @Override
    public void add(BicycleDto bicycle) {
        bicycles.add(bicycle);
    }

    @Override
    public int count() {
        return bicycles.size();
    }

    @Override
    public List<? extends BicycleDto> show() {
        return bicycles;
    }

    @Override
    public void changingGear() {

    }

    @Override
    public void changingPedalCadence() {

    }

    @Override
    public void applyingBrakes() {

    }
}

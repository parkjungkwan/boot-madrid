package kr.scalar.api.bicycle.service;

import kr.scalar.api.bicycle.domain.BicycleDTO;
import kr.scalar.api.dog.domain.DogDTO;

import java.util.ArrayList;
import java.util.List;

public class BicycleServiceImpl implements BicycleService{
    private BicycleDTO bicycle;
    private List<BicycleDTO> bicycles;

    public BicycleServiceImpl(){
        bicycle = new BicycleDTO();
        bicycles = new ArrayList<>();
    }

    @Override
    public void add(BicycleDTO bicycle) {
        bicycles.add(bicycle);
    }

    @Override
    public int count() {
        return bicycles.size();
    }

    @Override
    public List<?> show() {
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

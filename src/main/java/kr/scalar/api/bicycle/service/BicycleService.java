package kr.scalar.api.bicycle.service;

import kr.scalar.api.bicycle.domain.BicycleDTO;

import java.util.List;

public interface BicycleService {
    void add(BicycleDTO bicycle);
    int count();
    List<? extends BicycleDTO> show();
    void changingGear();
    void changingPedalCadence();
    void applyingBrakes();
}

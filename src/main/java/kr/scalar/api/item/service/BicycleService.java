package kr.scalar.api.item.service;

import kr.scalar.api.item.domain.BicycleDto;

import java.util.List;

public interface BicycleService {
    void add(BicycleDto bicycle);
    int count();
    List<? extends BicycleDto> show();
    void changingGear();
    void changingPedalCadence();
    void applyingBrakes();
}

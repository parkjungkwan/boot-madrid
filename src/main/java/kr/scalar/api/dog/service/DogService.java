package kr.scalar.api.dog.service;

import kr.scalar.api.dog.domain.DogDTO;
import java.util.List;

// barking, fetching, wagging tail
public interface DogService {
    void add(DogDTO dog);
    int count();
    List<?> show();
    String barking(String bark);
    String fetching(String target);
    String waggingTail();
}

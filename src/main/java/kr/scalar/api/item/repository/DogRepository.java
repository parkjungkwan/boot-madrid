package kr.scalar.api.item.repository;

import kr.scalar.api.item.domain.DogDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DogRepository {
    List<DogDto> findAll();
}

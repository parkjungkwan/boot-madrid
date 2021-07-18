package kr.scalar.api.dog.repository;

import kr.scalar.api.dog.domain.DogDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DogRepository {
    List<DogDTO> findAll();
}

package com.tts.simplewebproject.repository;

import com.tts.simplewebproject.model.Sneaker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
public interface SneakerRepository extends CrudRepository<Sneaker, Long> {

    Optional<Sneaker> findFirstByColor(String color);

    @Transactional
    void deleteByColor(String color);

}

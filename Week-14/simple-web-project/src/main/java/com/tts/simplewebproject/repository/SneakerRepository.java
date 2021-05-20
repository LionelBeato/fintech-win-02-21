package com.tts.simplewebproject.repository;

import com.tts.simplewebproject.model.Sneaker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SneakerRepository extends CrudRepository<Sneaker, Long> {
    Optional<Sneaker> getFirstByColor(String color);
}

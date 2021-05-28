package com.tts.WeatherApp.repository;

import com.tts.WeatherApp.model.ZipCode;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZipCodeRepository extends CrudRepository<ZipCode, Long> {
}

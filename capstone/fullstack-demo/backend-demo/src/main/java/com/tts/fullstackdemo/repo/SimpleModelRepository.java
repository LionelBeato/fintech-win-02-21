package com.tts.fullstackdemo.repo;

import com.tts.fullstackdemo.model.SimpleModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SimpleModelRepository extends CrudRepository<SimpleModel, Long> {
}

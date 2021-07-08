package com.tts.fullstackdemo.service;

import com.tts.fullstackdemo.model.SimpleModel;
import com.tts.fullstackdemo.repo.SimpleModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SimpleModelServiceImpl implements SimpleModelService {

    @Autowired
    SimpleModelRepository repository;

    @Override
    public SimpleModel createModel(SimpleModel simpleModel) {
        return repository.save(simpleModel);
    }

    @Override
    public List<SimpleModel> readAllModels() {
        return (List<SimpleModel>) repository.findAll();
    }

    @Override
    public SimpleModel updateModel(Long id, SimpleModel model) {
        return null;
    }

    @Override
    public SimpleModel deleteModel() {
        return null;
    }

}

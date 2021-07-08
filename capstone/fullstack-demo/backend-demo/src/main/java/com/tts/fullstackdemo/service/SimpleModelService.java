package com.tts.fullstackdemo.service;

import com.tts.fullstackdemo.model.SimpleModel;

import java.util.List;

public interface SimpleModelService {

    // CREATE

    public SimpleModel createModel(SimpleModel model);

    // READ

    public List<SimpleModel> readAllModels();

    // UPDATE

    public SimpleModel updateModel(Long id, SimpleModel model);

    // DELETE

    public SimpleModel deleteModel();

}

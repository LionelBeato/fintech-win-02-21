package com.tts.fullstackdemo.service;

import com.tts.fullstackdemo.model.User;

import java.util.List;

public interface UserService {

    // CREATE

    public User createModel(User model);

    // READ

    public List<User> readAllModels();

    // UPDATE

    public User updateModel(Long id, User model);

    // DELETE

    public User deleteModel();

}

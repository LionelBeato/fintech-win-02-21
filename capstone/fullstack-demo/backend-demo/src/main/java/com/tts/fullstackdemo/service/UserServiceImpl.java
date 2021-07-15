package com.tts.fullstackdemo.service;

import com.tts.fullstackdemo.model.User;
import com.tts.fullstackdemo.repo.SimpleModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    SimpleModelRepository repository;

    @Override
    public User createModel(User User) {
        return repository.save(User);
    }

    @Override
    public List<User> readAllModels() {
        return (List<User>) repository.findAll();
    }

    @Override
    public User updateModel(Long id, User model) {
        return null;
    }

    @Override
    public User deleteModel() {
        return null;
    }

}

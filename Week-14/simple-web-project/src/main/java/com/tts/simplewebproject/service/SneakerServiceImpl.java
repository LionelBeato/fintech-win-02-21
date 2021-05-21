package com.tts.simplewebproject.service;

import com.tts.simplewebproject.model.Sneaker;
import com.tts.simplewebproject.repository.SneakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SneakerServiceImpl implements SneakerService{

    @Autowired
    SneakerRepository sneakerRepository;

    @Override
    public Sneaker createSneaker(Sneaker sneaker) {
        return sneakerRepository.save(sneaker);
    }

    @Override
    public Sneaker readSneakerById(Long id) {
        return sneakerRepository.findById(id).orElseThrow();
    }

    @Override
    public Sneaker updateSneakerById(Long id, Sneaker sneaker) {
        Sneaker foundSneaker = sneakerRepository.findById(id).orElseThrow();
        foundSneaker.setColor(sneaker.getColor());
        return sneakerRepository.save(foundSneaker);
    }

    @Override
    public String deleteSneakerById(Long id) {
        sneakerRepository.deleteById(id);
        return "Sneaker successfully deleted!";
    }

    public String heyThere() {
        return "hey there";
    }

}

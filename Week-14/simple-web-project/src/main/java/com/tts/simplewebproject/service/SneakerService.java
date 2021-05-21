package com.tts.simplewebproject.service;

import com.tts.simplewebproject.model.Sneaker;

public interface SneakerService {

    // create

    Sneaker createSneaker(Sneaker sneaker);

    // read

    Sneaker readSneakerById(Long id);

    // update

    Sneaker updateSneakerById(Long id, Sneaker sneaker);

    // delete

    String deleteSneakerById(Long id);

}

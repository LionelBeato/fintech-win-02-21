package com.tts.day5.relationships;

import com.tts.day5.Planet;

// As an example of association
// Rocky planets can be associated with many moons

// at first blush, there's no difference between
// association and aggregation as its a logical distinction
// Is X object a composition made of Y object?
// if it is, that describes aggregation instead
public class Moon {
    Planet planet;
}

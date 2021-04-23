package com.tts.day5.relationships;

import java.util.List;

public class Car {
    // Car and wheel can exist
    // independently of another
    // so, we say there's an aggregation
    List<Wheel> wheels;
}

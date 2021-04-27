package com.tts.day2;

import java.util.ArrayList;
import java.util.List;

public class BinaryHeap {

    List<Integer> heap;

    public BinaryHeap(){
        heap = new ArrayList<>();
        heap.add(null);
    }

    @Override
    public String toString() {
        return "BinaryHeap{" +
                "heap=" + heap +
                '}';
    }
}

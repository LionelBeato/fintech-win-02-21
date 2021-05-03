package com.tts.week12day1;

import java.util.concurrent.atomic.AtomicInteger;

public class SynchronizedCounter {

    private AtomicInteger c = new AtomicInteger(0) ;

//    public synchronized void increment() {
//        c++;
//    }
//
//    public synchronized void decrement() {
//        c--;
//    }
//
//    public synchronized int value() {
//        return c;
//    }


    public void increment() {
        c.incrementAndGet();
    }

    public void decrement() {
        c.decrementAndGet();
    }

    public int value() {
        return c.get();
    }

}

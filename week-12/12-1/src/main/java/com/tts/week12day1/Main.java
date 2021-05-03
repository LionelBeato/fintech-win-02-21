package com.tts.week12day1;

public class Main {

    // this main method is known as our entrypoint
    // but in fact, it's also known as our main thread
    // the main thread can create other threads
    public static void main(String[] args) {
        System.out.println("Hello world, I'm in a main thread!");

        // We create a new Thread instance
        // we pass a runnable object into that instance
        // thread has a method called start() which it invokes
        // to begin the execution of our runnable
        (new Thread(new HelloRunnable())).start();
        Thread th = new Thread(new HelloRunnable());
        th.start();

        // Keep in mind that Runnable is a functional interface
        // we can use lambda expressions to implement its method
        Runnable task = () -> System.out.println("Hello from a lambda! " +
                "Here's the thread id: " + Thread.currentThread().getId());

        // currentThread().getId() will access the id of the thread below
        (new Thread(task)).start();

        (new HelloThread()).start();

    }

}

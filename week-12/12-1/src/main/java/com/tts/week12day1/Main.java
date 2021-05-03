package com.tts.week12day1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {

    // this main method is known as our entrypoint
    // but in fact, it's also known as our main thread
    // the main thread can create other threads
    public static void main(String[] args) throws InterruptedException, ExecutionException {
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

        String[] importantInfo = {
                "Mares eat oats",
                "Does eat oats",
                "Little lambs eat ivy",
                "A kid will eat ivy too"
        };


        // below is an anonymous inner class
        Runnable messageTask = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < importantInfo.length; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        return;
                    }
                    System.out.println(importantInfo[i]);
                }
            }
        };

        for (int i = 0; i < importantInfo.length; i++) {
            // I want to pause the executing thread for 4 seconds
            Thread.sleep(1000);
            // print out message after the pause
            System.out.println(importantInfo[i]);
        }

        (new Thread(messageTask)).start();

        // below is an example of an executor
        // this abstracts away thread management
        // if you want to work with a Callable, you will need to utilize ExecutorService instead
//        Executor executor = new Executor() {
//            @Override
//            public void execute(Runnable command) {
//                command.run();
//            }
//        };

        // this lambda is the same as the above
        Executor executor = command -> command.run();

        executor.execute(() -> System.out.println("Hello from an executable"));
        executor.execute(() -> System.out.println("Hello again from an executable"));

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(() -> System.out.println("Hello from an executorservice"));
        // returned values are wrapped around a Future

        Future<String> myFuture = executorService.submit(() -> "Hello from a Callable");

        System.out.println(myFuture.get());



    }
}

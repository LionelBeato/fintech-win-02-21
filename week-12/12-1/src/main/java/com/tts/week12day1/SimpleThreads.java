package com.tts.week12day1;

public class SimpleThreads {

    // this method will display the thread name
    // and the passed in message
    static void threadMessage(String message) {
        String threadName = Thread.currentThread().getName();
        System.out.printf("%s: %s%n",
                threadName,
                message);
    }

     static class MessageLoop implements Runnable {

        @Override
        public void run() {

            String[] importantInfo = {
                    "Mares eat oats",
                    "Does eat oats",
                    "Little lambs eat ivy",
                    "A kid will eat ivy too"
            };

            try {
                for (String s : importantInfo) {
                    Thread.sleep(4000);
                    threadMessage(s);
                }
            } catch(InterruptedException e) {
                e.printStackTrace();
                threadMessage("I wasn't done");
            }
        }
    }

    // our main thread can accept a CLI argument
    // here our argument will represent seconds
    public static void main(String[] args) throws InterruptedException {

        long patience = 1000 * 60 * 60;

        if (args.length > 0) {
            try {
                patience = Long.parseLong(args[0]) * 1000;
            } catch (NumberFormatException e) {
                System.err.println("Argument must be an integer");
                System.exit(1);
            }
        }

        threadMessage("Starting MessageLoop thread");
        long startTime = System.currentTimeMillis();
        Thread t = new Thread(new MessageLoop());
        t.start();

        threadMessage("Waiting for MessageLoop thread to finish");
        while(t.isAlive()) {
            threadMessage("Still waiting...");
            t.join(1000);

            if (((System.currentTimeMillis() - startTime) > patience)
                    && t.isAlive()) {
                threadMessage("Tired of waiting");
                t.interrupt();
                t.join();
            }

        }
        threadMessage("Finally!");

    }
}

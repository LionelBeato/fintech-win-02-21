package com.tts.week12day1.lambda;

public class Main {

    public static void main(String[] args) {

        MyLambda lambda = (x) -> System.out.println("Hello from a lambda!");
        MyLambda addTwo = (x) -> System.out.println(x + 2);

        MyLambda myLambda = new MyLambda() {
            @Override
            public void doThing(int x) {
                System.out.println("Hello from an anonymous inner class!");
            }
        };

        lambda.doThing(5);
        addTwo.doThing(5);
        myLambda.doThing(5);

    }

}

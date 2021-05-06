package com.tts.creational;

public class SingletonClass {

    private String message = "hello from an instance!";
    // since this field is static, we are able to have our instance
    // refer to the same instance each and every invocation of getInstance()
//    private final static SingletonClass singletonClass == new SingletonClass();
    private static SingletonClass singletonClass;

    // if we want to control construction
    // we can make our constructor private
    // only the class itself can construct instances
    private SingletonClass() {

    }

//     public static SingletonClass getInstance() {
//        return singletonClass;
//    }

    public static SingletonClass getInstance() {

        if (singletonClass == null) singletonClass = new SingletonClass();

        return singletonClass;
    }

    public String getMessage() {
        return message;
    }

//    public void setMessage(String message) {
//        this.message = message;
//    }

}

package com.learnJava.lambda;

public class RunnableLambdaExample {

    public static void main(String[] args) {
        // Prior to Java 8
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };
        new Thread(runnable).start();

        // Java 8 lambda
        // () -> {};

        Runnable runnableLambda = () -> {
            System.out.println("Inside Runnable 2.0");
            System.out.println("Inside Runnable 2.1");
        };
        new Thread(runnableLambda).start();

        Runnable runnableLambda1 = () -> System.out.println("Inside Runnable 3");
        new Thread(runnableLambda1).start();

        new Thread(() -> System.out.println("Inside Runnable 4")).start();
    }
}

package com.learnJava.lambda;

import java.util.function.Consumer;

public class LambdaVariable1 {

    public static void main(String[] args) {
        int i = 0;
        // not allowed to use the same name as the local variable as the lambda parameter
        Consumer<Integer> c1 = (i1) -> {
            // int i; -> not allowed to use the same local variable name inside the lambda body
            System.out.println("Value is :" + i);
        };
    }
}

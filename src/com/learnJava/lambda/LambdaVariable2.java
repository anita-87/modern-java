package com.learnJava.lambda;

import java.util.function.Consumer;

public class LambdaVariable2 {

    static int value = 4;

    public static void main(String[] args) {
        // int value = 4; // local variable

        Consumer<Integer> c1 = (i) -> {
            // value++; -> not allow to re-assign a value to a local variable
            value++; // if the variable is no local then it can be modified
            System.out.println(value+i);
        };

        // value = 6; -> not allowed to modify the value if is used inside the lambda body

        c1.accept(4);
    }
}

package com.learnJava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

    public static Optional<Integer> limit(List<Integer> integers) {
        return integers.stream()
                // 6
                // 7
                // 8
                // 9
                // 10
                .limit(3)
                // 6
                // 7
                .reduce(Integer::sum);
    }

    public static Optional<Integer> skip(List<Integer> integers) {
        return integers.stream()
                // 6
                // 7
                // 8
                // 9
                // 10
                .skip(3)
                // 9
                // 10
                .reduce(Integer::sum);
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(6, 7, 8, 9, 10);
        Optional<Integer> limitResult = limit(integers);
        limitResult.ifPresent(integer -> System.out.println("The limit result is: " + integer));

        Optional<Integer> skipResult = skip(integers);
        skipResult.ifPresent(integer -> System.out.println("The skip result is: " + integer));
    }
}

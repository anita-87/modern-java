package com.learnJava.numericstreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangesExample {

    public static void main(String[] args) {
        IntStream intStream = IntStream.range(1, 50);
        System.out.println("IntStream Range count:" + intStream.count());
        IntStream.range(1, 50).forEach((value -> System.out.print(value+",")));
        System.out.println();
        System.out.println("IntStream RangeClosed count: " + IntStream.rangeClosed(1, 50).count());
        IntStream.rangeClosed(1, 50).forEach((value -> System.out.print(value+",")));

        System.out.println();
        System.out.println("LongStream Range count:" + LongStream.range(1,50).count());
        LongStream.range(1, 50).forEach((value -> System.out.print(value+",")));
        System.out.println();
        System.out.println("LongStream RangeClosed count: " + LongStream.rangeClosed(1, 50).count());
        LongStream.rangeClosed(1, 50).forEach((value -> System.out.print(value+",")));

        System.out.println();
        IntStream.range(1,50).asDoubleStream().forEach((value -> System.out.print(value+",")));
    }
}

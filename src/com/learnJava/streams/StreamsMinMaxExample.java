package com.learnJava.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

    public static int findMaxValue(List<Integer> integerList) {
        return integerList.stream()
                // 6  -> y
                // 7  -> y
                // 8  -> y
                // 9  -> y
                // 10 -> y
                // x holds the max value for each element in the iteration
                .reduce(0, (x, y) -> x>y ? x : y);
    }

    public static int findMinValue(List<Integer> integerList) {
        return integerList.stream()
                // 6  -> y
                // 7  -> y
                // 8  -> y
                // 9  -> y
                // 10 -> y
                // x holds the min value for each element in the iteration
                .reduce(0, (x, y) -> x<y ? x : y);
    }

    public static Optional<Integer> findMaxValueOptional(List<Integer> integerList) {
        return integerList.stream()
                // 6  -> y
                // 7  -> y
                // 8  -> y
                // 9  -> y
                // 10 -> y
                // x holds the max value for each element in the iteration
                .reduce((x, y) -> x>y ? x : y);
    }

    public static Optional<Integer> findMinValueOptional(List<Integer> integerList) {
        return integerList.stream()
                // 6  -> y
                // 7  -> y
                // 8  -> y
                // 9  -> y
                // 10 -> y
                // x holds the min value for each element in the iteration
                .reduce((x, y) -> x<y ? x : y);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6,7,8,9,10);

        System.out.println("max value is: " + findMaxValue(integerList));

        List<Integer> emptyList = new ArrayList<>();
        System.out.println("max value is: " + emptyList);

        Optional<Integer> maxValueOptional = findMaxValueOptional(emptyList);
        if (maxValueOptional.isPresent()) {
            System.out.println("max value using optional: " + maxValueOptional.get());
        } else {
            System.out.println("Input list is empty");
        }

        System.out.println("min value is: " + findMinValue(integerList));
        Optional<Integer> minValueOptional = findMinValueOptional(integerList);
        if (minValueOptional.isPresent()) {
            System.out.println("min value using optional: " + minValueOptional.get());
        } else {
            System.out.println("Input list is empty");
        }
    }
}

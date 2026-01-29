package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;

public class StreamsFilterExample {

    public static List<Student> filterStudents() {
        return StudentDataBase.getAllStudents()
                .stream()
                .filter((student -> student.getGender().equals("female")))
                .filter(student -> student.getGpa() >= 3.9)
                .toList();
    }

    public static void main(String[] args) {
        System.out.println("filtered students: ");
        filterStudents().forEach(System.out::println);
    }
}

package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;

public class StreamsComparatorExample {

    public static List<Student> sortStudentsByName() {
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .toList();
    }

    public static List<Student> sortStudentsByGpa() {
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .toList();
    }

    public static List<Student> sortStudentsByGpaDesc() {
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .toList();
    }

    public static void main(String[] args) {
        System.out.println("Student sorted by name");
        sortStudentsByName().forEach(System.out::println);

        System.out.println("Student sorted by Gpa");
        sortStudentsByGpa().forEach(System.out::println);

        System.out.println("Student sorted by Gpa Desc");
        sortStudentsByGpaDesc().forEach(System.out::println);
    }
}

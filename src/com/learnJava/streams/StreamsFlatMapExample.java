package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;

public class StreamsFlatMapExample {

    public static List<String> printStudentActivities() {
        return StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream) // Stream<String>
                .distinct() // Stream<String> -> removes duplicates
                .sorted() // Sort the stream in alphabetical order
                .toList(); // List<String>
    }

    public static long getStudentActivitiesCount() {
        return StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream) // Stream<String>
                .distinct() // Stream<String> -> removes duplicates
                .count(); // number of elements of the Stream
    }

    public static void main(String[] args) {
        System.out.println(printStudentActivities());
        System.out.println(getStudentActivitiesCount());
    }
}

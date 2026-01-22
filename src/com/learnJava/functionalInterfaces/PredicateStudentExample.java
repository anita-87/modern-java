package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;
    static Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;

    static void filterStudentsByGradeLevel() {
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((s) -> {
            if (p1.test(s)) {
                System.out.println(s.toString());
            }
        });
    }

    static void filterStudentsByGpa() {
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((s) -> {
            if (p2.test(s)) {
                System.out.println(s.toString());
            }
        });
    }

    static void filterStudents() {
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((s) -> {
            if (p1.and(p2).test(s)) {
                System.out.println(s.toString());
            }
        });
    }

    public static void main(String[] args) {
        System.out.println("filterStudentsByGradeLevel()");
        filterStudentsByGradeLevel();

        System.out.println("filterStudentsByGpa()");
        filterStudentsByGpa();

        System.out.println("filterStudents()");
        filterStudents();
    }
}

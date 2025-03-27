package com.example.javaapiprac2;

import java.util.ArrayList;
import java.util.List;

public class Student {
//    Student has id
//    Student has age
//    Student has a list of teachers.
//    They have a list of courses they are taking
    private int id;
    private int age;
    private String name;
    private List<Course> enrolledCourses = new ArrayList<>();

    public Student(int id, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

//    Getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public int getId() { return id; }
    public List<Course> getEnrolledCourses() { return enrolledCourses; }

//    Setters
    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
    }

    public void dropCourse(int courseId) {
        enrolledCourses.removeIf(course -> course.getId() == courseId);
    }
}

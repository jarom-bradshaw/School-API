package com.example.javaapiprac2;

public class Course {
    private int courseId;
    private String courseName;
    private String courseDescription;
    private String instructor;

    public Course(int courseId, String courseName, String courseDescription, String instructor) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.instructor = instructor;
    }

    public int getCourseId() { return courseId; }
    public String getCourseName() { return courseName; }
    public String getCourseDescription() { return courseDescription; }
    public String getInstructor() { return instructor; }
}

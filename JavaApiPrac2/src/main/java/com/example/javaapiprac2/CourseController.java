package com.example.javaapiprac2;

import com.example.javaapiprac2.Course;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {
    private List<Course> courses = new ArrayList<>();
    private int idCounter = 1;

//    Get all
    @GetMapping
    public List<Course> getAllCourses() {
        return courses;
    }
// Get specific
//    @GetMapping("/{id}")
//    public Course getCourseByID(@PathVariable int id) {
//        return courses.stream();
//    }

//Add this please
}
//Post

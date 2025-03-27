package com.example.javaapiprac2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaApiPrac2Application {

	public static void main(String[] args) {
		SpringApplication.run(JavaApiPrac2Application.class, args);
	}

}
//The goal is to make a course and student so that we can register students to courses. The relationship is many to many.
//A course can have many students and a student can have many courses.
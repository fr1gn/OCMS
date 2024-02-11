package org.online.controllers;

import org.online.com.Course;
import org.online.repesitories.interfaces.ICourseRepository;

import java.util.List;

public class CourseController {
    private final ICourseRepository repo;

    public CourseController(ICourseRepository repo) {
        this.repo = repo;
    }

    public String getCourse(int id) {
        Course course = repo.getCourseById(id);

        return (course == null ? "Course was not found!" : course.toString());
    }
    public String getAllCourses() {
        List<Course> courses = repo.getAllCourses();

        StringBuilder response = new StringBuilder();
        for (Course course : courses) {
            response.append(course.toString()).append("\n");
        }

        return response.toString();
    }
}

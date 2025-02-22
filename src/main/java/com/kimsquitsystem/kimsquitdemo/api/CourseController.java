package com.kimsquitsystem.kimsquitdemo.api;

import com.kimsquitsystem.kimsquitdemo.model.Course;
import com.kimsquitsystem.kimsquitdemo.model.Student;
import com.kimsquitsystem.kimsquitdemo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/v1/course")
@RestController
public class CourseController {
    private final CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @GetMapping(path = "{id}")
    public Course getCourseById(@PathVariable("id") String id) {
        return courseService.getCourseById(id)
                .orElse(null);
    }

    @GetMapping(path = "{id}/students")
    public List<Student> getStudentsInCourse(@PathVariable("id") String courseId) {
        return courseService.getStudentsInCourse(courseId);
    }
}

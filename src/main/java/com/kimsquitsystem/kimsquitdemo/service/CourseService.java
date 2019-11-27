package com.kimsquitsystem.kimsquitdemo.service;

import com.kimsquitsystem.kimsquitdemo.dao.CourseDao;
import com.kimsquitsystem.kimsquitdemo.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    private final CourseDao courseDao;

    @Autowired
    public CourseService(@Qualifier("course") CourseDao courseDao) {
        this.courseDao = courseDao;
    }

    public List<Course> getAllCourses() {
        return courseDao.selectAllCourses();
    }

    public Optional<Course> getCourseById(String id) {
        return courseDao.selectCourseById(id);
    }
}

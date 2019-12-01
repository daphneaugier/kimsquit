package com.kimsquitsystem.kimsquitdemo.Testdao;

import com.kimsquitsystem.kimsquitdemo.dao.CourseDao;
import com.kimsquitsystem.kimsquitdemo.model.Course;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@SpringBootTest
public class TestCourseDao {

    @Autowired
    CourseDao courseDao;

    @Test
    public void getListOfTeachers(){
        List<Course> courses = new ArrayList<>();
        Assertions.assertEquals(courses.size(),0);
        courses  = courseDao.selectAllCourses();
        Assertions.assertNotEquals(courses.size(),0);

    }

    @Test
    public void getSpecificCourse(){
        Optional<Course> course = null;

        Assertions.assertNull(course);

        course = courseDao.selectCourseById("ARTS10");

        Assertions.assertNotNull(course);
    }

}
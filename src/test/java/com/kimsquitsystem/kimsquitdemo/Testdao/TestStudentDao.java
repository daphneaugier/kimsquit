package com.kimsquitsystem.kimsquitdemo.Testdao;

import com.kimsquitsystem.kimsquitdemo.dao.StudentDao;
import com.kimsquitsystem.kimsquitdemo.model.Student;
import com.kimsquitsystem.kimsquitdemo.model.Course;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@SpringBootTest
public class TestStudentDao {

    @Autowired
    StudentDao studentDao;

    @Test
    public void getListOfStudents(){
        List<Student> students = new ArrayList<>();
        Assertions.assertEquals(students.size(),0);
        students  = studentDao.selectAllStudents();
        Assertions.assertNotEquals(students.size(),0);
    }

    @Test
    public void getSpecificStudent(){
        Optional<Student> student = null;
        Assertions.assertNull(student);
        student = studentDao.selectStudentById("1");
        Assertions.assertNotNull(student);
    }

    @Test
    public void getCoursesById(){
        List<Course> courses = new ArrayList<>();
        Assertions.assertEquals(courses.size(),0);
        courses = studentDao.selectCoursesByStudentId(1);
        Assertions.assertNotNull(courses);
    }

}
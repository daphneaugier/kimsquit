package com.kimsquitsystem.kimsquitdemo.Testdao;

import com.kimsquitsystem.kimsquitdemo.model.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.kimsquitsystem.kimsquitdemo.dao.TeacherDao;


@SpringBootTest
public class TestTeacherDao {

    @Autowired
    TeacherDao teacherDao;

    @Test
    public void getListOfTeachers(){
        List<Teacher> teachers = new ArrayList<>();
        Assertions.assertEquals(teachers.size(),0);
        teachers  = teacherDao.selectAllTeachers();
        Assertions.assertNotEquals(teachers.size(),0);
    }

    @Test
    public void getSpecificTeacher(){
        Optional<Teacher> teacher = null;
        Assertions.assertNull(teacher);
        //Queries first id of Teacher table
        teacher = teacherDao.selectByTeacherId("1");
        //Checks if the object exists
        Assertions.assertNotNull(teacher);
    }

}

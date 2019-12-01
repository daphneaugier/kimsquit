package com.kimsquitsystem.kimsquitdemo.Testdao;

import com.kimsquitsystem.kimsquitdemo.dao.GradeDao;
import com.kimsquitsystem.kimsquitdemo.model.Grade;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@SpringBootTest
public class TestGradeDao {

    @Autowired
    GradeDao gradeDao;

    @Test
    public void getListOfGrades(){
        List<Grade> grades = new ArrayList<>();
        Assertions.assertEquals(grades.size(),0);
        grades  = gradeDao.selectAllGrades();
        Assertions.assertNotEquals(grades.size(),0);
    }

    @Test
    public void getSpecificGradeByStudentId(){
        List<Grade> grade1 = null;
        Assertions.assertNull(grade1);
        grade1 = gradeDao.selectGradesByStudentId(1);
        Assertions.assertNotNull(grade1);
    }

    @Test
    public void getSpecificGradeByStudentAndCourseId(){
        Optional<Grade> grade2 = null;
        Assertions.assertNull(grade2);
        grade2 = gradeDao.selectGradeByStudentAndCourseId(11, "ENGL10");
        Assertions.assertNotNull(grade2);
    }
}
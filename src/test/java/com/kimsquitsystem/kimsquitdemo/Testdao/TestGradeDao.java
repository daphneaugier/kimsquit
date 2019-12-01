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
    public void getSpecificGrade(){
        List<Grade> grade = null;

        Assertions.assertNull(grade);

        grade = gradeDao.selectGradesByStudentId(1);

        Assertions.assertNotNull(grade);
    }

}
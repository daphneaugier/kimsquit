package com.kimsquitsystem.kimsquitdemo.service;

import com.kimsquitsystem.kimsquitdemo.dao.GradeDao;
import com.kimsquitsystem.kimsquitdemo.model.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeService {
    private final GradeDao gradeDao;

    @Autowired
    public GradeService(GradeDao gradeDao) {
        this.gradeDao = gradeDao;
    }

    public List<Grade> getAllGrades() {
        return gradeDao.selectAllGrades();
    }

    public List<Grade> getGradesByStudentId(int studentId) {
        return gradeDao.selectGradesByStudentId(studentId);
    }
}

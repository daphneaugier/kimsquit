package com.kimsquitsystem.kimsquitdemo.service;

import com.kimsquitsystem.kimsquitdemo.dao.StudentDao;
import com.kimsquitsystem.kimsquitdemo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;
import java.util.Optional;

public class StudentService {
    private final StudentDao studentDao;

    @Autowired
    public StudentService(@Qualifier("course") StudentDao courseDao) {
        this.studentDao = courseDao;
    }

    public List<Student> getAllStudents() {
        return studentDao.selectAllStudentss();
    }

    public Optional<Student> getStudentById(String id) {
        return studentDao.selectStudentById(id);
    }
}

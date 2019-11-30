package com.kimsquitsystem.kimsquitdemo.service;

import com.kimsquitsystem.kimsquitdemo.dao.TeacherDao;
import com.kimsquitsystem.kimsquitdemo.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {
    private final TeacherDao teacherDao;

    @Autowired
    public TeacherService(@Qualifier("teacher") TeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    public List<Teacher> getAllTeachers() {
        return teacherDao.selectAllTeachers();
    }

    public Optional<Teacher> getTeacherById(String id) {
        return teacherDao.selectByTeacherId(id);
    }
}

package com.kimsquitsystem.kimsquitdemo.api;

import com.kimsquitsystem.kimsquitdemo.service.TeacherService;
import com.kimsquitsystem.kimsquitdemo.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/v1/teacher")
@RestController
public class TeacherController {
    private final TeacherService teacherService;

    @Autowired
    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping
    public List<Teacher> getAllTeachers() {
        return teacherService.getAllTeachers();
    }

    @GetMapping(path="{id}")
    public Teacher getTeacherById(@PathVariable("id") String id) {
        return teacherService.getTeacherById(id)
                .orElse(null);
    }
}
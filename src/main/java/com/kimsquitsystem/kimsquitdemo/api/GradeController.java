package com.kimsquitsystem.kimsquitdemo.api;

import com.kimsquitsystem.kimsquitdemo.model.Grade;
import com.kimsquitsystem.kimsquitdemo.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Path;
import java.util.List;

@RequestMapping("/api/v1/grade")
@RestController
public class GradeController {
    private final GradeService gradeService;

    @Autowired
    public GradeController(GradeService gradeService) {
        this.gradeService = gradeService;
    }

    @GetMapping
    public List<Grade> getAllGrades() {
        return gradeService.getAllGrades();
    }

    @GetMapping(path = "{student_id}")
    public List<Grade> getGradesByStudentId(@PathVariable("student_id") int studentId) {
        return gradeService.getGradesByStudentId(studentId);
    }

    @GetMapping(path = "{student_id}/{course_id}")
    public Grade getGradeByStudentIdAndCourseId(@PathVariable("student_id") int studentId, @PathVariable("course_id") String courseId) {
        return gradeService.getGradeByStudentIdAndCourseId(studentId, courseId)
                .orElse(null);
    }
}

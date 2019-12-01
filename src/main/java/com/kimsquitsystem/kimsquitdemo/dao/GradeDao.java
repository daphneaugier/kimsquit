package com.kimsquitsystem.kimsquitdemo.dao;

import com.kimsquitsystem.kimsquitdemo.model.Grade;
import com.kimsquitsystem.kimsquitdemo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("grade")
public class GradeDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public GradeDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Grade> selectAllGrades() {
        final String sql = "SELECT course_id, student_id, grade FROM grade";
        List<Grade> grades = jdbcTemplate.query(sql, (resultSet, i) -> {
            String course_id = resultSet.getString("course_id");
            int student_id = resultSet.getInt("student_id");
            int grade = resultSet.getInt("grade");
            return new Grade(course_id, student_id, grade);
        });
        return grades;
    }

    public List<Grade> selectGradesByStudentId(int studentId) {
        final String sql = "SELECT course_id, student_id, grade FROM grade WHERE student_id = ?";
        List<Grade> grades = jdbcTemplate.query(sql, new Object[]{studentId}, (resultSet, i) -> {
            String course_id = resultSet.getString("course_id");
            int student_id = resultSet.getInt("student_id");
            int grade = resultSet.getInt("grade");
            return new Grade(course_id, student_id, grade);
        });
        return grades;
    }

    public Optional<Grade> selectGradeByStudentAndCourseId(int studentId, String courseId) {
        final String sql = "SELECT course_id, student_id, grade FROM grade WHERE student_id = ? AND course_id = ?";
        Grade grade = jdbcTemplate.queryForObject(sql, new Object[]{studentId, courseId}, (resultSet, i) ->
        {
            String courseIdDb = resultSet.getString("course_id");
            int studentIdDb = resultSet.getInt("student_id");
            int gradeDb = resultSet.getInt("grade");
            return new Grade(courseIdDb,studentIdDb,gradeDb);
        });
        return Optional.ofNullable(grade);
    }
}

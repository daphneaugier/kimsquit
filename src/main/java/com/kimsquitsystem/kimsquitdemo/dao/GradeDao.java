package com.kimsquitsystem.kimsquitdemo.dao;

import com.kimsquitsystem.kimsquitdemo.model.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

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
}

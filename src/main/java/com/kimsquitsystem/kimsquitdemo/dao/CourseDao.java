package com.kimsquitsystem.kimsquitdemo.dao;

import com.kimsquitsystem.kimsquitdemo.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("course")
public class CourseDao {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public CourseDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Course> selectAllCourses() {
        final String sql = "SELECT course_id, course_name, course_description FROM course";
        List<Course> courses = jdbcTemplate.query(sql, (resultSet, i) -> {
            String course_id = resultSet.getString("course_id");
            String courseName = resultSet.getString("course_name");
            String  courseDescription = resultSet.getString("course_description");
            return new Course(course_id, courseName, courseDescription);
        });
        return courses;
    }
}

package com.kimsquitsystem.kimsquitdemo.dao;

import com.kimsquitsystem.kimsquitdemo.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("teacher")
public class TeacherDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public TeacherDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Teacher> selectAllTeachers() {
        final String sql = "SELECT teacher_id, first_name, last_name FROM teacher";
        List<Teacher> teachers = jdbcTemplate.query(sql, (resultSet, i) ->
        {
            int user_id = resultSet.getInt("teacher_id");
            String firstName = resultSet.getString("first_name");
            String lastName = resultSet.getString("last_name");
            String address = resultSet.getString("address");
            return new Teacher(user_id, firstName,lastName, address);
        });
        return teachers;
    }

    public Optional<Teacher> selectByTeacherId(String id) {
        final String sql = "SELECT teacher_id, first_name, last_name FROM teacher WHERE teacher_id = ?";
        Teacher teacher = jdbcTemplate.queryForObject(sql, new Object[]{ id }, (resultSet, i) ->
        {
            int user_id = resultSet.getInt("teacher_id");
            String firstName = resultSet.getString("first_name");
            String lastName = resultSet.getString("last_name");
            String address = resultSet.getString("address");
            return new Teacher(user_id, firstName, lastName, address);
        });
        return Optional.ofNullable(teacher);
    }
}

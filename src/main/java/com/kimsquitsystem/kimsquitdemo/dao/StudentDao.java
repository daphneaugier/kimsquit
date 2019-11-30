package com.kimsquitsystem.kimsquitdemo.dao;

import com.kimsquitsystem.kimsquitdemo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("student")
public class StudentDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public StudentDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Student> selectAllStudentss() {
        final String sql = "SELECT student_id, first_name, last_name, address, group_id  FROM student";
        List<Student> students = jdbcTemplate.query(sql, (resultSet, i) -> {
            int user_id = resultSet.getInt("student_id");
            String firstName = resultSet.getString("first_name");
            String lastName = resultSet.getString("last_name");
            String address = resultSet.getString("address");
            int group_id = resultSet.getInt("group_id");
            return new Student(user_id, firstName, lastName, address, group_id);
        });
        return students;
    }

    public Optional<Student> selectStudentById(String id) {
        final String sql = "SELECT student_id, first_name, last_name, address, group_id  FROM student WHERE student_id = ?";
        Student student = jdbcTemplate.queryForObject(sql, new Object[]{id}, (resultSet, i) ->
        {
            int user_id = resultSet.getInt("student_id");
            String firstName = resultSet.getString("first_name");
            String lastName = resultSet.getString("last_name");
            String address = resultSet.getString("address");
            int group_id = resultSet.getInt("group_id");
            return new Student(user_id, firstName, lastName, address, group_id);
        });
        return Optional.ofNullable(student);
    }


}

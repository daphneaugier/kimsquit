package com.kimsquitsystem.kimsquitdemo.dao;

import com.kimsquitsystem.kimsquitdemo.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("mysql")
public class TestDataAccessService implements TestDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public TestDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Test> selectAllData() {
        final String sql = "SELECT id, Name, Number FROM test";
        List<Test> data = jdbcTemplate.query(sql, (resultSet, i) -> {
            int id = resultSet.getInt("id");
            String Name = resultSet.getString("Name");
            int Number = resultSet.getInt("Number");
            return new Test(id, Name, Number);
        });
        return data;
    }
}

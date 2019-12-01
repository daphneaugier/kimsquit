package com.kimsquitsystem.kimsquitdemo.dao;

import com.kimsquitsystem.kimsquitdemo.model.Announcement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("announcement")
public class AnnouncementDao {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public AnnouncementDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Announcement> selectAllAnnouncements() {
        final String sql = "SELECT announcement_id, course_id, date, announcement FROM announcement";
        List<Announcement> announcements = jdbcTemplate.query(sql, (resultSet, i) -> {
            String announcement_id = resultSet.getString("announcement_id");
            String course_id = resultSet.getString("course_id");
            String date = resultSet.getString("date");
            String announcement_text = resultSet.getString("announcement");
            return new Announcement(announcement_id, course_id, date, announcement_text);
        });
        return announcements;
    }

    public Optional<Announcement> selectAnnouncementByCourseId(String CourseId) {
        final String sql = "SELECT course_id, announcement_id,  date, announcement FROM announcement WHERE course_id = ?";
        Announcement announcement = jdbcTemplate.queryForObject(sql, new Object[]{CourseId}, (resultSet, i) -> {
            String announcement_id = resultSet.getString("announcement_id");
            String course_id = resultSet.getString("course_id");
            String date = resultSet.getString("date");
            String announcement_text = resultSet.getString("announcement");
            return new Announcement(announcement_id, course_id, date, announcement_text);
        });
        return Optional.ofNullable(announcement);
    }
}

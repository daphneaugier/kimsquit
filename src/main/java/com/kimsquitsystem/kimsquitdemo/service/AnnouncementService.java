package com.kimsquitsystem.kimsquitdemo.service;

import com.kimsquitsystem.kimsquitdemo.dao.AnnouncementDao;
import com.kimsquitsystem.kimsquitdemo.model.Announcement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnnouncementService {
    private final AnnouncementDao announcementDao;

    @Autowired
    public AnnouncementService(@Qualifier("announcement") AnnouncementDao announcementDao) {
        this.announcementDao = announcementDao;
    }

    public List<Announcement> getAllAnnouncements() {
        return announcementDao.selectAllAnnouncements();
    }

    public List<Announcement> getAnnouncementsByCourseId(String courseId) {
        return announcementDao.selectAnnouncementByCourseId(courseId);
    }
}

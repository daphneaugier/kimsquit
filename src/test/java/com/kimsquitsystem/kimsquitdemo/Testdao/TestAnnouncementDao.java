package com.kimsquitsystem.kimsquitdemo.Testdao;

import com.kimsquitsystem.kimsquitdemo.dao.AnnouncementDao;
import com.kimsquitsystem.kimsquitdemo.model.Announcement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@SpringBootTest
public class TestAnnouncementDao {

    @Autowired
    AnnouncementDao announcementDao;

    @Test
    public void getListOfAnnouncements(){
        List<Announcement> announcements = new ArrayList<>();
        Assertions.assertEquals(announcements.size(),0);
        announcements  = announcementDao.selectAllAnnouncements();
        Assertions.assertNotEquals(announcements.size(),0);

    }

    @Test
    public void getSpecificAnnouncement(){
        List<Announcement> announcement = null;

        Assertions.assertNull(announcement);

        announcement = announcementDao.selectAnnouncementByCourseId("ENGL10");

        Assertions.assertNotNull(announcement);
    }

}
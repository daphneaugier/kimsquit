package com.kimsquitsystem.kimsquitdemo.api;

import com.kimsquitsystem.kimsquitdemo.model.Announcement;
import com.kimsquitsystem.kimsquitdemo.service.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/v1/announcement")
@RestController
public class AnnouncementController {
    private final AnnouncementService announcementService;

    @Autowired
    public AnnouncementController(AnnouncementService announcementService) {
        this.announcementService = announcementService;
    }

    @GetMapping
    public List<Announcement> getAllAnnouncements() {
        return announcementService.getAllAnnouncements();
    }

    @GetMapping(path = "{courseId}")
    public Announcement getAnnouncementsByCourseId(@PathVariable("courseId") String courseId) {
        return announcementService.getAnnouncementsByCourseId(courseId).orElse(null);
    }
}

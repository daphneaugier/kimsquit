package com.kimsquitsystem.kimsquitdemo.model;

public class Announcement {
    final private String announcementId;
    final private String courseId;
    final private String date;
    final private String announcementText;

    public Announcement(String announcementId, String courseId,String date ,String annoucementText) {
        this.announcementId = announcementId;
        this.courseId = courseId;
        this.announcementText = annoucementText;
        this.date = date;
    }

    public String getAnnouncementId() {
        return announcementId;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getAnnoucementText() {
        return announcementText;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Announcement{" +
                "annoucementText='" + announcementText + '\'' +
                date +
                '}';
    }


}

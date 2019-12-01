package com.kimsquitsystem.kimsquitdemo.model;

public class Announcement {
    private final String announcementId;
    private final String courseId;
    private final String date;
    private final String announcement;

    public Announcement(String announcementId, String courseId, String date, String announcement) {
        this.announcementId = announcementId;
        this.courseId = courseId;
        this.announcement = announcement;
        this.date = date;
    }

    public String getAnnouncementId() {
        return announcementId;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getAnnouncement() {
        return announcement;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Announcement{" +
                "announcementId='" + announcementId + '\'' +
                ", courseId='" + courseId + '\'' +
                ", date='" + date + '\'' +
                ", announcement='" + announcement + '\'' +
                '}';
    }
}

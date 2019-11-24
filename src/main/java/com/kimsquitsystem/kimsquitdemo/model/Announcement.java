package com.kimsquitsystem.kimsquitdemo.model;

public class Announcement {
    private String announcementId;
    private String courseId;
    private String date;
    private String announcementText;

    public Announcement(String announcementId, String courseId,String date ,String annoucementText) {
        this.announcementId = announcementId;
        this.courseId = courseId;
        this.announcementText = annoucementText;
        this.date = date;
    }

    public String getAnnouncementId() {
        return announcementId;
    }

    public void setAnnouncementId(String announcementId) {
        this.announcementId = announcementId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getAnnoucementText() {
        return announcementText;
    }

    public void setAnnoucementText(String annoucementText) {
        this.announcementText = annoucementText;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    @Override
    public String toString() {
        return "Announcement{" +
                "annoucementText='" + announcementText + '\'' +
                date +
                '}';
    }


}

package com.kimsquitsystem.kimsquitdemo.model;

public class Announcement {
    private String announcementId;
    private String courseId;
    private String annoucementText;

    public Announcement(String announcementId, String courseId, String annoucementText) {
        this.announcementId = announcementId;
        this.courseId = courseId;
        this.annoucementText = annoucementText;
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
        return annoucementText;
    }

    public void setAnnoucementText(String annoucementText) {
        this.annoucementText = annoucementText;
    }

    @Override
    public String toString() {
        return "Announcement{" +
                "annoucementText='" + annoucementText + '\'' +
                '}';
    }
}

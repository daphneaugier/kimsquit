package com.kimsquitsystem.kimsquitdemo.model;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private String courseID;
    private ArrayList<Announcement> announcements;

    /**
     * Constructor for Course Object
     * @param courseName
     * @param courseId
     * @param announcements
     */
    public Course(String courseName, String courseId, ArrayList<Announcement> announcements) {
        this.courseName = courseName;
        this.courseID = courseId;
        this.announcements = announcements;
    }

    /**
     * get name of course
     * @return
     */
    final public String getCourseName() {
        return courseName;
    }

    /**
     * set name of course
     * @param courseName
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * get course id
     * @return
     */
    final public String getCourseID() {
        return courseID;
    }

    /**
     * set course id
     * @param courseID
     */
    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    /**
     * get announcements
     * @return
     */
    public ArrayList<Announcement> getAnnouncements() {
        return announcements;
    }

    /**
     * set announcements
     * @param announcements
     */
    public void setAnnouncements(ArrayList<Announcement> announcements) {
        this.announcements = announcements;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseID='" + courseID + '\'' +
                ", membersofCourse=" + announcements +
                '}';
    }


}

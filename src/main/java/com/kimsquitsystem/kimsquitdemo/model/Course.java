package com.kimsquitsystem.kimsquitdemo.model;

import java.util.ArrayList;

public class Course {
    final private String courseName;
    final private String courseID;
    final private ArrayList<Announcement> announcements;

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
     * get course id
     * @return
     */
    final public String getCourseID() {
        return courseID;
    }

    /**
     * get announcements
     * @return
     */
    public ArrayList<Announcement> getAnnouncements() {
        return announcements;
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

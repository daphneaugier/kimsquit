package com.kimsquitsystem.kimsquitdemo.model;

import java.util.ArrayList;
import java.util.HashMap;

public class Course {
    private String courseName;
    private String courseID;
    // For userIDs to connect to User object which may be a student or teacher
    private HashMap<String,User> membersofCourse;
    private ArrayList<Announcement> annoucements;

    /**
     * Constructor for Course Object
     * @param courseName
     * @param courseId
     * @param membersofCourse
     */
    public Course(String courseName, String courseId, HashMap<String, User> membersofCourse) {
        this.courseName = courseName;
        this.courseID = courseId;
        this.membersofCourse = membersofCourse;
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
     * get members of course
     * @return
     */
    public HashMap<String, User> getMembersofCourse() {
        return membersofCourse;
    }

    /**
     * set members of course
     * @param membersofCourse
     */
    public void setMembersofCourse(HashMap<String, User> membersofCourse) {
        this.membersofCourse = membersofCourse;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseID='" + courseID + '\'' +
                ", membersofCourse=" + membersofCourse +
                '}';
    }
}

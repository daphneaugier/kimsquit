package com.kimsquitsystem.kimsquitdemo.model;

import java.util.ArrayList;

public class Course {
    private final String courseId;
    private final String courseName;
    private final String courseDescription;

    /**
     * Constructor for Course Object
     * @param courseName
     * @param courseId
     * @param courseDescription
     */
    public Course(String courseId, String courseName, String courseDescription) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
    }

    /**
     * get name of course
     * @return
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * get course id
     * @return
     */
    public String getCourseId() {
        return courseId;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", courseDescription='" + courseDescription + '\'' +
                '}';
    }
}

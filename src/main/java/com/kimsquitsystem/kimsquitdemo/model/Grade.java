package com.kimsquitsystem.kimsquitdemo.model;


public class Grade {
    private final String courseId;
    private final int studentId;
    private final int Grade;

    public Grade(String courseId, int studentId, int numberGrade) {
        this.courseId = courseId;
        this.studentId = studentId;
        this.Grade = numberGrade;
    }

    public String getCourseId() {
        return courseId;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getGrade() {
        return Grade;
    }
}

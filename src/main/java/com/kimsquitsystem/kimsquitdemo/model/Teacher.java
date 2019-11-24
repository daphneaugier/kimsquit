package com.kimsquitsystem.kimsquitdemo.model;

import java.util.HashMap;

public class Teacher extends User {

    public Teacher(String userId, String firstName, String lastName, HashMap<String, Course> inCourses) {
        super(userId, firstName, lastName, inCourses);
    }

    @Override
    public String toString() {
        return "Teacher{} " + super.toString();
    }
}

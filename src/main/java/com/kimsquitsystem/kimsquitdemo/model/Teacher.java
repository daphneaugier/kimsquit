package com.kimsquitsystem.kimsquitdemo.model;

import java.util.HashMap;

public class Teacher extends User {

    public Teacher(String userId, String firstName, String lastName) {
        super(userId, firstName, lastName);
    }

    @Override
    public String toString() {
        return "Teacher{} " + super.toString();
    }
}

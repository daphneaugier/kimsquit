package com.kimsquitsystem.kimsquitdemo.model;

public class Teacher extends User {
    private final String address;

    public Teacher(int userId, String firstName, String lastName, String address) {
        super(userId, firstName, lastName);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Teacher{} " + super.toString();
    }
}

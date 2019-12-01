package com.kimsquitsystem.kimsquitdemo.model;

public class Student extends User {
    private final int groupId;
    private final String address;

    public Student(int userId, String firstName, String lastName, String address, int groupId) {
        super(userId, firstName, lastName);
        this.groupId = groupId;
        this.address = address;
    }

    public int getGroupId() {
        return groupId;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "groupId=" + groupId +
                ", address='" + address + '\'' +
                "} " + super.toString();
    }
}

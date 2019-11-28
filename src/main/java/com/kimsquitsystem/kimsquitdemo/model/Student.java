package com.kimsquitsystem.kimsquitdemo.model;

import java.util.HashMap;

public class Student extends User {
    final private int groupId;
    final private String address;

    /**
     * Constructor for Student
     * @param userId
     * @param firstName
     * @param lastName
     * @param address
     * @param groupId
     */
    public Student(String userId, String firstName, String lastName, String address, int groupId) {
        super(userId, firstName, lastName);
        this.groupId = groupId;
        this.address = address;
    }

    /**
     *
     * @return return map of which student in the group
     */
    public int getGroupId() {
        return groupId;
    }

    /**
     * Get Student's addres
     * @return
     */
    public String getAddress() {
        return address;
    }

    /**
     * String student and its attributes.
     * @return
     */
    @Override
    public String toString() {
        return "Student{" +
                "groupIds=" + groupId +
                ", address='" + address + '\'' +
                "} " + super.toString();
    }
}

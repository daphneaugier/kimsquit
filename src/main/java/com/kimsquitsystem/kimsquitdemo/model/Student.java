package com.kimsquitsystem.kimsquitdemo.model;

import java.util.HashMap;

public class Student extends User {
    final private HashMap<String,String> groupIds;
    final private String address;

    /**
     * Constructor for Student
     * @param userId
     * @param firstName
     * @param lastName
     * @param inCourses
     * @param groupIds
     * @param address
     */
    public Student(String userId, String firstName, String lastName, HashMap<String, Course> inCourses, HashMap<String, String> groupIds, String address) {
        super(userId, firstName, lastName, inCourses);
        this.groupIds = groupIds;
        this.address = address;
    }

    /**
     *
     * @return return map of which student in the group
     */
    public HashMap<String, String> getGroupIds() {
        return groupIds;
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
                "groupIds=" + groupIds +
                ", address='" + address + '\'' +
                "} " + super.toString();
    }
}

package com.kimsquitsystem.kimsquitdemo.model;

import java.util.HashMap;

public class User {

    final private String userId;
    final private String firstName;
    final private String lastName;
    final private HashMap<String,Course> inCourses;

    /**
     * Default User Constructor
     */
    public User() {
        userId = null;
        firstName = null;
        lastName = null;
        inCourses = null;
    }

    /**
     * Constructor for user
     * @param userId
     * @param firstName
     * @param lastName
     * @param inCourses
     */
    public User(String userId, String firstName, String lastName, HashMap<String, Course> inCourses) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.inCourses = inCourses;
    }

    /**
     *
     * @return first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @return last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * get User Id
     * @return
     */
    final public String getUserId() {
        return userId;
    }

    /**
     *
     * @return String of first name and last name
     */
    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    /**
     * get courses user is part of
     * @return
     */
    public HashMap<String, Course> getInCourses() {
        return inCourses;
    }
}

package com.kimsquitsystem.kimsquitdemo.model;

import java.util.HashMap;

public class User {

    private String userId;
    private String firstName;
    private String lastName;
    private HashMap<String,Course> inCourses;

    /**
     * Default User Constructor
     */
    public User() {
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
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @return last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * get User Id
     * @return
     */
    final public String getUserId() {
        return userId;
    }

    /**
     * set user Id
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
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

    /**
     * set courses user is part of
     * @param inCourses
     */
    public void setInCourses(HashMap<String, Course> inCourses) {
        this.inCourses = inCourses;
    }
}

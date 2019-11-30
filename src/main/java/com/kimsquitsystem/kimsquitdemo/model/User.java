package com.kimsquitsystem.kimsquitdemo.model;

import java.util.HashMap;

public class User {

    final private int userId;
    final private String firstName;
    final private String lastName;

    /**
     * Constructor for user
     * @param userId
     * @param firstName
     * @param lastName
     */
    public User(int userId, String firstName, String lastName) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
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
    public int getUserId() {
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
}

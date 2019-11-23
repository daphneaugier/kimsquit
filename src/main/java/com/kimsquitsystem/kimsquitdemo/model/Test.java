package com.kimsquitsystem.kimsquitdemo.model;

public class Test {
   private final int id;
   private final String name;
   private final int number;

    public Test(int id, String name, int number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
}

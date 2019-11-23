package com.kimsquitsystem.kimsquitdemo.dao;

import com.kimsquitsystem.kimsquitdemo.model.Test;

import java.util.List;

public interface TestDao {
    List<Test> selectAllData();
}

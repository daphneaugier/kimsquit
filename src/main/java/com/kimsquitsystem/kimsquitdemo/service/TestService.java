package com.kimsquitsystem.kimsquitdemo.service;

import com.kimsquitsystem.kimsquitdemo.dao.TestDao;
import com.kimsquitsystem.kimsquitdemo.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TestService {
    private final TestDao testDao;

    @Autowired
    public TestService(@Qualifier("mysql") TestDao testDao) {
        this.testDao = testDao;
    }

    public List<Test> getAllData() {
        return testDao.selectAllData();
    }

}

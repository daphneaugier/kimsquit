package com.kimsquitsystem.kimsquitdemo.api;

import com.kimsquitsystem.kimsquitdemo.model.Test;
import com.kimsquitsystem.kimsquitdemo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/v1/test")
@RestController
public class TestController {
    private final TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping
    public List<Test> getAllData() {
        return testService.getAllData();
    }
}

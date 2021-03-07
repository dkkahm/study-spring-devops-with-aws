package com.example.demo4.controllers;

import com.example.demo4.jms.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeControler {
    @Autowired
    FakeJmsBroker fakeJmsBroker;

    @GetMapping("/")
    public String home() {
        return "Hello3:" + fakeJmsBroker.toString();
    }
}

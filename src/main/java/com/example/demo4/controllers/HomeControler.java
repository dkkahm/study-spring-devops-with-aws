package com.example.demo4.controllers;

import com.example.demo4.jms.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class HomeControler {
    @Autowired
    FakeJmsBroker fakeJmsBroker;

    @GetMapping("/")
    public String home() {
        return "Hello4 from " + getIp();
    }

    private static String getIp(){
        String result = null;
        try {
            result = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            result = "";
        }
        return result;
    }

}

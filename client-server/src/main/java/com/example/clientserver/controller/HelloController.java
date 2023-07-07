package com.example.clientserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private Environment env;

    @GetMapping("/message")
    public String getOwnerName() {
        System.out.println("env.getProperty(\"owner.name\") ::: "+env.getProperty("owner.name"));
        return env.getProperty("owner.name");
    }
}

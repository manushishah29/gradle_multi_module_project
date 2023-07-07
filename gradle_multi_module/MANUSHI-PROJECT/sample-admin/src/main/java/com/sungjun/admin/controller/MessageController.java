package com.sungjun.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @Value("${example.message}")
    private String msg;

    @RequestMapping("/message")
    String getMsg() {
        return this.msg;
    }
}

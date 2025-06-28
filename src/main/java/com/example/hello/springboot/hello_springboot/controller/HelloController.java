package com.example.hello.springboot.hello_springboot.controller;

import com.example.hello.springboot.hello_springboot.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private Constants constant;

    @GetMapping("/hello")
    public String hello() {
        return constant.HELLO_SPRING_BOOT;
    }
}

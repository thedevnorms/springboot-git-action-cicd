package com.dev.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/welcome")
    public String welcome()
    {
        System.out.println("hello world! Alhamdulillah");
        return "Welcome to Git Action CI CD! Its Done";
    }
}

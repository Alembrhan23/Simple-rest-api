package com.simplerestapi.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ResourceController {

    @GetMapping("/message")
    public String getMessage(){
        return "Hello, here is your message!";
    }
    @GetMapping("/welcome")
    public String getWelcome(){
        return "Welcome to this application";
    }
}

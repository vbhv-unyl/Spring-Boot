package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/greet")

public class GreetingController {

    // GET /api/greet/hello
    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, World!";
    }
}

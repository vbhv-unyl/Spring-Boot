package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @PostMapping("/addUser")
    public String addUser(@RequestBody UserRequest userRequest) {
        // Print received data in console
        System.out.println("Received user: " + userRequest.getName() + ", " + userRequest.getEmail());
        // Return confirmation to client
        return "User " + userRequest.getName() + " added successfully!";
    }

}

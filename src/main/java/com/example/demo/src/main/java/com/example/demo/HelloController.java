package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class HelloController {

    @GetMapping("/api/message")
    public String message() {
        return "Backend is running successfully 🚀";
    }
}

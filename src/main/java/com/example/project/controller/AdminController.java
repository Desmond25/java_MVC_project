package com.example.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/adminPage")
public class AdminController {
    @GetMapping
    public String adminPage() {
        return ("adminPage");
    }
}

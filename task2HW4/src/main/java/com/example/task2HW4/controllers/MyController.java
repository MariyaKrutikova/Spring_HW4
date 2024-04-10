package com.example.task3HW4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Random;

@Controller
public class MyController {
    @GetMapping("/age")
    public String getRandomNumber(Model model) {
        model.addAttribute("age1", 13);
        model.addAttribute("age2", 8);
        model.addAttribute("age3", 1);
        return "childrenAge";
    }
}

package com.example.task3HW4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Возраст детей
 * */
@Controller
public class MyController {
    @GetMapping("/age")
    public String getAge(Model model) {
        model.addAttribute("age1", 13);
        model.addAttribute("age2", 8);
        model.addAttribute("age3", 1);
        return "childrenAge";
    }


    /**
     * Средний возраст детей
     * */
    @GetMapping("/averageAge/{age1}/{age2}/{age3}")
    public String getAverageAge(@PathVariable("age1") Integer age1,
                                @PathVariable("age2") Integer age2,
                                @PathVariable("age3") Integer age3,
                                Model model) {
        model.addAttribute("age1", age1);
        model.addAttribute("age2", age2);
        model.addAttribute("age3", age3);
        model.addAttribute("average", (age1+age2+age3)/3);
        return "averageAge";
    }
}

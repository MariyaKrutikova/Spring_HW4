package com.example.task3HW4.controller;

import com.example.task3HW4.model.Section;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Controller;
import com.example.task3HW4.services.SectionService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
class SectionController {
    private final SectionService sectionService;

    public SectionController(SectionService sectionService) {
        this.sectionService = sectionService;
    }

    @GetMapping("/sections")
    public String viewSections(Model model) {
        model.addAttribute("sections", sectionService.findAll());
        return "section";
    }

    @PostMapping("/sections")
    public String addSection(Section s, Model model) {
        sectionService.addSection(s);
        model.addAttribute("sections", sectionService.findAll());
        return "section.html";
    }
}

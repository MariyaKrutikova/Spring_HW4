package com.example.task3HW4.services;

import com.example.task3HW4.model.Section;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor
@Service
public class SectionService {
    private List<Section> sections = new ArrayList<>();

    public void addSection(Section s) {
        sections.add(s);
    }

    public List<Section> findAll() {
        return sections;
    }
}

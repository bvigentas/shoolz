package com.github.bvigentas.schoords.controller;

import com.github.bvigentas.schoords.dto.SubjectsCourseDTO;
import com.github.bvigentas.schoords.entity.Course;
import com.github.bvigentas.schoords.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService service;

    @PostMapping
    private void add(@Validated @RequestBody Course course) {
        this.service.add(course);
    }

    @GetMapping("/{id}")
    private Course find(@PathVariable Long id) {
        return this.service.find(id);
    }

    @PostMapping("/add-subjects")
    private void addSubjects(@Validated @RequestBody SubjectsCourseDTO subjectsCourseDTO) throws Exception {
        this.service.addSubjects(subjectsCourseDTO);
    }

}

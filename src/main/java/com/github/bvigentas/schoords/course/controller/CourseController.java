package com.github.bvigentas.schoords.course.controller;

import com.github.bvigentas.schoords.subject.dto.SubjectsCourseDTO;
import com.github.bvigentas.schoords.course.entity.Course;
import com.github.bvigentas.schoords.course.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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

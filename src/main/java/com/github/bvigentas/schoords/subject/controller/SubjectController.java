package com.github.bvigentas.schoords.subject.controller;

import com.github.bvigentas.schoords.subject.entity.Subject;
import com.github.bvigentas.schoords.subject.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/subject")
public class SubjectController {

    @Autowired
    private SubjectService service;

    @PostMapping
    private void add(@Validated @RequestBody Subject subject) {
        this.service.add(subject);
    }

    @GetMapping("/{id}")
    private Subject find(@PathVariable Long id) {
        return this.service.find(id);
    }

}

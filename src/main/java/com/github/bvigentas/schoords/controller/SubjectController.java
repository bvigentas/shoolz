package com.github.bvigentas.schoords.controller;

import com.github.bvigentas.schoords.entity.Subject;
import com.github.bvigentas.schoords.service.SubjectService;
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

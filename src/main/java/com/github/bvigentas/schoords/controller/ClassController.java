package com.github.bvigentas.schoords.controller;

import com.github.bvigentas.schoords.entity.Class;
import com.github.bvigentas.schoords.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/class")
public class ClassController {

    @Autowired
    private ClassService service;

    @PostMapping
    public void add(@Validated @RequestBody Class turma) {
        service.add(turma);
    }

    @GetMapping("/{id}")
    public Class find(@PathVariable Long id) {
        return service.find(id);
    }

}

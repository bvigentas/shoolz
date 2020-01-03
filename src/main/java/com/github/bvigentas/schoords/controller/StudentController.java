package com.github.bvigentas.schoords.controller;


import com.github.bvigentas.schoords.dto.GradeFilter;
import com.github.bvigentas.schoords.dto.StudentFilter;
import com.github.bvigentas.schoords.dto.StudentGradeDTO;
import com.github.bvigentas.schoords.entity.Grade;
import com.github.bvigentas.schoords.entity.Student;
import com.github.bvigentas.schoords.repository.StudentDAO;
import com.github.bvigentas.schoords.repository.StudentRepository;
import com.github.bvigentas.schoords.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService service;

    @Autowired
    private StudentRepository repository;

    @Autowired
    private StudentDAO dao;

    @PostMapping
    public void add(@Validated @RequestBody Student student) {
        service.add(student);
    }

    @GetMapping("/{id}")
    public Student find(@PathVariable Long id) {
        return repository.getOne(id);
    }

    @PutMapping
    public void update(@Validated @RequestBody Student student) {
        service.update(student);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @GetMapping("/list")
    public List<Student> list(@Validated @RequestBody StudentFilter filter) {
        return dao.searchStudent(filter);
    }

    @PostMapping("/new-grade")
    public void newGrade(@Validated @RequestBody StudentGradeDTO gradeDTO) {
        service.newGrade(gradeDTO);
    }

    @GetMapping("/list-grade")
    public List<Grade> listGrade(@Validated @RequestBody GradeFilter filter) {
        return null;
    }

}


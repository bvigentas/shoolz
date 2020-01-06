package com.github.bvigentas.schoords.subject.service;

import com.github.bvigentas.schoords.subject.entity.Subject;
import com.github.bvigentas.schoords.subject.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepository repository;

    public void add(Subject subject) {

        Subject subjectDB = this.repository.findByDescription(subject.getDescription());

        if (subjectDB == null) {
            this.repository.save(subject);
        } else {
            //Exception
        }
    }

    public Subject find(Long id) {
        return this.repository.getOne(id);
    }
}

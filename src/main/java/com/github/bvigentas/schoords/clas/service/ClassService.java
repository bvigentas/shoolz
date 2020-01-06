package com.github.bvigentas.schoords.clas.service;

import com.github.bvigentas.schoords.clas.entity.Class;
import com.github.bvigentas.schoords.clas.repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassService {

    @Autowired
    private ClassRepository repository;

    public void add(Class turma) {

        Class classDB = repository.findByCode(turma.getCode());

        if (classDB == null) {
            repository.save(turma);
        } else {
            //Exception
        }

    }

    public Class find(Long id) {
        return repository.getOne(id);
    }

}

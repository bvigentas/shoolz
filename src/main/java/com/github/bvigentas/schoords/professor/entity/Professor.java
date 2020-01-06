package com.github.bvigentas.schoords.professor.entity;

import com.github.bvigentas.schoords.person.entity.Person;
import com.github.bvigentas.schoords.school.entity.School;
import com.github.bvigentas.schoords.subject.entity.Subject;

import javax.persistence.*;
import java.util.List;

public class Professor extends Person {

    @ManyToMany
    @JoinTable(
            name="professor_subject",
            joinColumns = @JoinColumn(name = "professor_id"),
            inverseJoinColumns = @JoinColumn(name = "subject_id")
    )
    private List<Subject> subjects;

    @ManyToOne
    @JoinColumn(name = "school_id")
    private School school;

    private int register;
}

package com.github.bvigentas.schoords.course.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.github.bvigentas.schoords.entity.BaseEntity;
import com.github.bvigentas.schoords.clas.entity.Class;
import com.github.bvigentas.schoords.subject.entity.Subject;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class Course extends BaseEntity {

    @JsonIgnore
    @OneToMany(mappedBy = "course")
    private List<Class> classes;

    private String name;

    private int duration;

    @ManyToMany
    @JoinTable(
            name = "course_subject",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "subject_id")
    )
    private List<Subject> subjects;

    public void addSubject(Subject subject) {
        this.subjects.add(subject);
    }
}

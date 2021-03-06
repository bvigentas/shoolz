package com.github.bvigentas.schoords.school.entity;

import com.github.bvigentas.schoords.entity.BaseEntity;
import com.github.bvigentas.schoords.course.entity.Course;
import com.github.bvigentas.schoords.professor.entity.Professor;
import com.github.bvigentas.schoords.student.entity.Student;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.List;

public class School extends BaseEntity {

    @OneToMany(mappedBy = "school")
    private List<Professor> professors;

    @ManyToMany
    @JoinTable(
            name = "school_course",
            joinColumns = @JoinColumn(name = "school_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private List<Course> courses;

    @OneToMany(mappedBy = "school")
    private List<Student> students;

    private String name;
}

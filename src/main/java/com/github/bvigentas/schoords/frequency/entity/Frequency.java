package com.github.bvigentas.schoords.frequency.entity;

import com.github.bvigentas.schoords.entity.BaseEntity;
import com.github.bvigentas.schoords.student.entity.Student;
import com.github.bvigentas.schoords.subject.entity.Subject;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Getter
@Setter
@Entity
public class Frequency extends BaseEntity {

    @OneToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;

    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;

    private Double frequencia;

}

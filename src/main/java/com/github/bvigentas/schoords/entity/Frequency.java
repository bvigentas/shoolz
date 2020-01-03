package com.github.bvigentas.schoords.entity;

import com.github.bvigentas.schoords.entity.BaseEntity;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Frequency extends BaseEntity {

    @OneToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;

    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;

    private Double frequencia;

}

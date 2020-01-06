package com.github.bvigentas.schoords.student.entity;

import com.github.bvigentas.schoords.clas.entity.Class;
import com.github.bvigentas.schoords.person.entity.Person;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Getter
@Setter
@Entity
public class Student extends Person {

    @ManyToOne
    private Class turma;

}

package com.github.bvigentas.schoords.entity;

import com.github.bvigentas.schoords.entity.Person;
import lombok.Data;
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

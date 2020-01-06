package com.github.bvigentas.schoords.contact.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.github.bvigentas.schoords.entity.BaseEntity;
import com.github.bvigentas.schoords.person.entity.Person;
import com.github.bvigentas.schoords.contact.enums.TipoMeioContato;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@Setter
@Entity
public class Contact extends BaseEntity {

    private TipoMeioContato tipo;

    private String email;

    private int DDD;

    private int numero;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

}

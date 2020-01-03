package com.github.bvigentas.schoords.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.github.bvigentas.schoords.enums.TipoMeioContato;
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

package com.github.bvigentas.schoords.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Getter
@Setter
@Entity
public class Neighborhood extends BaseEntity {

    private String nome;

    @OneToOne(mappedBy = "neighborhood")
    private Address address;
}

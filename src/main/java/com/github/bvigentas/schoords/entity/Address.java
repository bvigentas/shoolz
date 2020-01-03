package com.github.bvigentas.schoords.entity;

import com.github.bvigentas.schoords.enums.UF;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Getter
@Setter
@Entity
public class Address extends BaseEntity {

    private UF uf;

    private String cep;

    private int numero;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "neighborhood_id", referencedColumnName = "id")
    private Neighborhood neighborhood;

    @OneToOne
    @JoinColumn(name = "city_id")
    private City city;
}

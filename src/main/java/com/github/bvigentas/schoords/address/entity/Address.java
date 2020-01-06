package com.github.bvigentas.schoords.address.entity;

import com.github.bvigentas.schoords.entity.BaseEntity;
import com.github.bvigentas.schoords.city.entity.City;
import com.github.bvigentas.schoords.neighborhood.entity.Neighborhood;
import com.github.bvigentas.schoords.address.enums.UF;
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

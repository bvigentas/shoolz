package com.github.bvigentas.schoords.neighborhood.entity;

import com.github.bvigentas.schoords.address.entity.Address;
import com.github.bvigentas.schoords.entity.BaseEntity;
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

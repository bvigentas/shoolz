package com.github.bvigentas.schoords.entity;

import com.github.bvigentas.schoords.entity.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class City extends BaseEntity {

    private String nome;

    private int codigoIbge;
}

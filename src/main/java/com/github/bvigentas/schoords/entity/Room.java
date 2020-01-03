package com.github.bvigentas.schoords.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.github.bvigentas.schoords.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Getter
@Setter
@Entity
public class Room extends BaseEntity {

    private String descricao;

    @JsonIgnore
    @OneToOne(mappedBy = "room")
    private Class turma;

}

package com.github.bvigentas.schoords.room.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.github.bvigentas.schoords.entity.BaseEntity;
import com.github.bvigentas.schoords.clas.entity.Class;
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

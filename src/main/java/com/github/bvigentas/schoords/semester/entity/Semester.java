package com.github.bvigentas.schoords.semester.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.github.bvigentas.schoords.entity.BaseEntity;
import com.github.bvigentas.schoords.grade.entity.Grade;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Setter
@Getter
@Entity
public class Semester extends BaseEntity {

    private Integer year;

    private Integer semester;

    @JsonIgnore
    @OneToMany(mappedBy = "semester")
    private List<Grade> grades;

}

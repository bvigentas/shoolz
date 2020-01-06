package com.github.bvigentas.schoords.subject.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.github.bvigentas.schoords.entity.BaseEntity;
import com.github.bvigentas.schoords.grade.entity.Grade;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Subject extends BaseEntity implements Serializable {

    @JsonIgnore
    @OneToMany(mappedBy = "subject")
    private List<Grade> grades;

    private String description;

}

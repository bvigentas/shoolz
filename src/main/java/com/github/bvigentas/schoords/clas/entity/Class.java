package com.github.bvigentas.schoords.clas.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.github.bvigentas.schoords.course.entity.Course;
import com.github.bvigentas.schoords.entity.BaseEntity;
import com.github.bvigentas.schoords.room.entity.Room;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Class extends BaseEntity {

    @OneToOne
    @JoinColumn(name = "room_id", referencedColumnName = "id")
    private Room room;

    @ManyToOne
    @JoinColumn(name = "course_id", referencedColumnName = "id")
    private Course course;

    private String code;

}

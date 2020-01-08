package com.github.bvigentas.schoords.grade.entity;

import com.github.bvigentas.schoords.entity.BaseEntity;
import com.github.bvigentas.schoords.professor.entity.Professor;
import com.github.bvigentas.schoords.semester.entity.Semester;
import com.github.bvigentas.schoords.student.entity.Student;
import com.github.bvigentas.schoords.subject.entity.Subject;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Grade extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "subject_id", referencedColumnName = "id")
    private Subject subject;

    @ManyToOne
    @JoinColumn(name = "professor_id", referencedColumnName = "id")
    private Professor professor;

    @ManyToOne
    @JoinColumn(name = "semester_id", referencedColumnName = "id")
    private Semester semester;

    private Double value;

}

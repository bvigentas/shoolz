package com.github.bvigentas.schoords.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SubjectsCourseDTO {

    private List<Long> idSubjects;

    private Long idCourse;

}

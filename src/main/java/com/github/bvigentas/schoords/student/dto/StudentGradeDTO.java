package com.github.bvigentas.schoords.student.dto;

import lombok.Data;

@Data
public class StudentGradeDTO {

    private Long idStudent;
    private Long idSubject;
    private Long idProfessor;
    private Long idSemester;
    private Double value;

}

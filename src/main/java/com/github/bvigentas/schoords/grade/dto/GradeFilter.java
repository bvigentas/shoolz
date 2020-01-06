package com.github.bvigentas.schoords.grade.dto;

import com.github.bvigentas.schoords.dto.AbstractFilter;
import com.github.bvigentas.schoords.student.entity.Student;
import com.github.bvigentas.schoords.subject.entity.Subject;
import lombok.Data;

@Data
public class GradeFilter extends AbstractFilter {

    private Subject subject;
    private Student student;

}

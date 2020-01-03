package com.github.bvigentas.schoords.dto;

import com.github.bvigentas.schoords.entity.Student;
import com.github.bvigentas.schoords.entity.Subject;
import lombok.Data;

@Data
public class GradeFilter extends AbstractFilter {

    private Subject subject;
    private Student student;

}

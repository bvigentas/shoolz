package com.github.bvigentas.schoords.service;


import com.github.bvigentas.schoords.dto.StudentGradeDTO;
import com.github.bvigentas.schoords.entity.Grade;
import com.github.bvigentas.schoords.entity.Student;
import com.github.bvigentas.schoords.entity.Subject;
import com.github.bvigentas.schoords.repository.GradeRepository;
import com.github.bvigentas.schoords.repository.StudentRepository;
import com.github.bvigentas.schoords.repository.SubjectRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private SubjectRepository subjectRepository;

    @Autowired
    private GradeRepository gradeRepository;

    public void add(Student student) {

        Student studentDB = studentRepository.findByDocument(student.getDocument());

        if (studentDB == null) {
            studentRepository.save(student);
        } else {
            //Exceotion
        }

    }

    public void update(Student student) {

        Student currentStudent = studentRepository.getOne(student.getId());
        BeanUtils.copyProperties(student, currentStudent);
        studentRepository.save(student);

    }

    public void newGrade(StudentGradeDTO gradeDTO) {

        Subject subject = subjectRepository.getOne(gradeDTO.getIdSubject());
        Student student = studentRepository.getOne(gradeDTO.getIdStudent());
        Grade grade = new Grade(student,
                subject,
                gradeDTO.getValue());

        gradeRepository.save(grade);

    }

}

package com.github.bvigentas.schoords.student.service;


import com.github.bvigentas.schoords.student.dto.StudentGradeDTO;
import com.github.bvigentas.schoords.grade.entity.Grade;
import com.github.bvigentas.schoords.student.entity.Student;
import com.github.bvigentas.schoords.subject.entity.Subject;
import com.github.bvigentas.schoords.grade.repository.GradeRepository;
import com.github.bvigentas.schoords.student.repository.StudentRepository;
import com.github.bvigentas.schoords.subject.repository.SubjectRepository;
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

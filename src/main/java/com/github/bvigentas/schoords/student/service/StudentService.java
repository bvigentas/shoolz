package com.github.bvigentas.schoords.student.service;


import com.github.bvigentas.schoords.grade.entity.Grade;
import com.github.bvigentas.schoords.grade.repository.GradeRepository;
import com.github.bvigentas.schoords.professor.entity.Professor;
import com.github.bvigentas.schoords.professor.repository.ProfessorRepository;
import com.github.bvigentas.schoords.semester.entity.Semester;
import com.github.bvigentas.schoords.semester.repository.SemesterRepository;
import com.github.bvigentas.schoords.student.dto.StudentGradeDTO;
import com.github.bvigentas.schoords.student.entity.Student;
import com.github.bvigentas.schoords.student.repository.StudentRepository;
import com.github.bvigentas.schoords.subject.entity.Subject;
import com.github.bvigentas.schoords.subject.repository.SubjectRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private StudentRepository studentRepository;
    private SubjectRepository subjectRepository;
    private GradeRepository gradeRepository;
    private ProfessorRepository professorRepository;
    private SemesterRepository semesterRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository, SubjectRepository subjectRepository, GradeRepository gradeRepository, ProfessorRepository professorRepository, SemesterRepository semesterRepository) {
        this.studentRepository = studentRepository;
        this.subjectRepository = subjectRepository;
        this.gradeRepository = gradeRepository;
        this.professorRepository = professorRepository;
        this.semesterRepository = semesterRepository;
    }

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
        Professor professor = professorRepository.getOne(gradeDTO.getIdProfessor());
        Semester semester = semesterRepository.getOne(gradeDTO.getIdSemester());
        Grade grade = new Grade(student,
                subject,
                professor,
                semester,
                gradeDTO.getValue());

        gradeRepository.save(grade);

    }

}

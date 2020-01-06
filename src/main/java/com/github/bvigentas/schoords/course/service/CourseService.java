package com.github.bvigentas.schoords.course.service;

import com.github.bvigentas.schoords.subject.dto.SubjectsCourseDTO;
import com.github.bvigentas.schoords.course.exception.CourseNotFoundException;
import com.github.bvigentas.schoords.course.entity.Course;
import com.github.bvigentas.schoords.subject.entity.Subject;
import com.github.bvigentas.schoords.subject.exception.SubjectNotFoundException;
import com.github.bvigentas.schoords.course.repository.CourseRepository;
import com.github.bvigentas.schoords.subject.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private SubjectRepository subjectRepository;

    public void add(Course course) {

        Course courseDB = this.courseRepository.findByName(course.getName());

        if (courseDB == null) {
            this.courseRepository.save(course);
        } else {
            //Exception
        }
    }

    public Course find(Long id) {
        return this.courseRepository.getOne(id);
    }

    private void addSubject(Long idSubject, Long idCourse) throws Exception {

        Course course = courseRepository.findById(idCourse).orElseThrow(() -> new CourseNotFoundException(idCourse));
        Subject subject = subjectRepository.findById(idSubject).orElseThrow(() -> new SubjectNotFoundException(idSubject));

        course.addSubject(subject);
        courseRepository.save(course);

    }

    public void addSubjects(SubjectsCourseDTO subjectsCourseDTO) throws Exception {

        for (Long idSubject: subjectsCourseDTO.getIdSubjects()) {
            this.addSubject(idSubject, subjectsCourseDTO.getIdCourse());
        }

    }

}

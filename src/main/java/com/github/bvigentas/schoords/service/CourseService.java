package com.github.bvigentas.schoords.service;

import com.github.bvigentas.schoords.dto.SubjectsCourseDTO;
import com.github.bvigentas.schoords.exception.CourseNotFoundException;
import com.github.bvigentas.schoords.entity.Course;
import com.github.bvigentas.schoords.entity.Subject;
import com.github.bvigentas.schoords.exception.SubjectNotFoundException;
import com.github.bvigentas.schoords.repository.CourseRepository;
import com.github.bvigentas.schoords.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

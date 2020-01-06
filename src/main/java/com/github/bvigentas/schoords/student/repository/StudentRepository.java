package com.github.bvigentas.schoords.student.repository;

import com.github.bvigentas.schoords.student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    Student findByDocument(String document);

}

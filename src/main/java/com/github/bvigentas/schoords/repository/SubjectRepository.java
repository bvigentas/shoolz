package com.github.bvigentas.schoords.repository;


import com.github.bvigentas.schoords.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {

    Subject findByDescription(String description);

}

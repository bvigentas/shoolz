package com.github.bvigentas.schoords.semester.repository;

import com.github.bvigentas.schoords.semester.entity.Semester;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SemesterRepository extends JpaRepository<Semester, Long> {
}

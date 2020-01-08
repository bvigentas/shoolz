package com.github.bvigentas.schoords.professor.repository;

import com.github.bvigentas.schoords.professor.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}

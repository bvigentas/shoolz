package com.github.bvigentas.schoords.repository;

import com.github.bvigentas.schoords.entity.Class;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRepository extends JpaRepository<Class, Long> {

    Class findByCode(String code);

}

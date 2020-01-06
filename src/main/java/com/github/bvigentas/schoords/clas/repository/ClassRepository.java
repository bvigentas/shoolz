package com.github.bvigentas.schoords.clas.repository;

import com.github.bvigentas.schoords.clas.entity.Class;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRepository extends JpaRepository<Class, Long> {

    Class findByCode(String code);

}

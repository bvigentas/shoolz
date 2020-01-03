package com.github.bvigentas.schoords.repository;

import com.github.bvigentas.schoords.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
}

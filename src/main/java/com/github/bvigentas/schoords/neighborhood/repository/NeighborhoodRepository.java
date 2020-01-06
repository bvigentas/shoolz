package com.github.bvigentas.schoords.neighborhood.repository;

import com.github.bvigentas.schoords.neighborhood.entity.Neighborhood;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NeighborhoodRepository extends JpaRepository<Neighborhood, Long> {
}

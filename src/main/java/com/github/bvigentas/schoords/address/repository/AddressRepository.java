package com.github.bvigentas.schoords.address.repository;

import com.github.bvigentas.schoords.address.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}

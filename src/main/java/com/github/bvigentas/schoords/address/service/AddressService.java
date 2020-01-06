package com.github.bvigentas.schoords.address.service;

import com.github.bvigentas.schoords.address.entity.Address;
import com.github.bvigentas.schoords.address.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private AddressRepository repository;

    public void add(Address address) {
        this.repository.save(address);
    }

    public Address find(Long id) {
        return this.repository.getOne(id);
    }

}

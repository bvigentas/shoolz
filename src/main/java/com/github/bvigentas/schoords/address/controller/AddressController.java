package com.github.bvigentas.schoords.address.controller;

import com.github.bvigentas.schoords.address.entity.Address;
import com.github.bvigentas.schoords.address.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService service;

    @PostMapping
    private void add(@Validated @RequestBody Address address) {
        this.service.add(address);
    }

    @GetMapping("/{id}")
    private Address find(@PathVariable Long id) {
        return this.service.find(id);
    }

}

package com.github.bvigentas.schoords.controller;

import com.github.bvigentas.schoords.entity.Address;
import com.github.bvigentas.schoords.service.AddressService;
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

package com.github.bvigentas.schoords.contact.controller;

import com.github.bvigentas.schoords.contact.entity.Contact;
import com.github.bvigentas.schoords.contact.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactService service;

    @PostMapping
    private void add(@Validated @RequestBody Contact contact) {
        this.service.add(contact);
    }

    @GetMapping("/{id}")
    private Contact find(@PathVariable Long id) {
        return this.service.find(id);
    }

}

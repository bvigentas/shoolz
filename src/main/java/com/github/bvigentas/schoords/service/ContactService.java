package com.github.bvigentas.schoords.service;

import com.github.bvigentas.schoords.entity.Contact;
import com.github.bvigentas.schoords.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    @Autowired
    private ContactRepository repository;

    public void add(Contact contact) {
        repository.save(contact);
    }

    public Contact find(Long id) {
        return repository.getOne(id);
    }

}

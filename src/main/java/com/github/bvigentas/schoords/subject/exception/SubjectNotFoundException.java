package com.github.bvigentas.schoords.subject.exception;

public class SubjectNotFoundException extends Exception {
    public SubjectNotFoundException(Long id) {
        super("Subject with ID " + id + " not found in the database");
    }
}

package com.github.bvigentas.schoords.course.exception;

public class CourseNotFoundException extends Exception {

    public CourseNotFoundException(Long id) {
        super("Course with ID " + id + " not found in the database");
    }

}

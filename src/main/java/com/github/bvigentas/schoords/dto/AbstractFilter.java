package com.github.bvigentas.schoords.dto;

import lombok.Setter;

import java.time.LocalDate;

@Setter
public class AbstractFilter implements Filter{

    private String name;
    private LocalDate initialCreationDate;
    private LocalDate finalCreationDate;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public LocalDate getInitialCreationDate() {
        return this.initialCreationDate;
    }

    @Override
    public LocalDate getFinalCreationDate() {
        return this.finalCreationDate;
    }
}

package com.github.bvigentas.schoords.dto;

import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

public interface Filter {

    String getName();
    LocalDate getInitialCreationDate();
    LocalDate getFinalCreationDate();

}

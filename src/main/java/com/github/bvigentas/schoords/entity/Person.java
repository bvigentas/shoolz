package com.github.bvigentas.schoords.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Person extends BaseEntity {

    private String document;

    private String firstName;

    private String lastName;

    @Column(name = "birth_date")
    private Date birthDate;

    @OneToMany(mappedBy = "person")
    private List<Contact> contacts;

    @OneToOne
    @JoinColumn(name = "Address")
    private Address address;
}

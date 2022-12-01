package com.dmitriev.model;


import jakarta.validation.constraints.NotEmpty;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "customer_name")
    @NotEmpty
    private String name;

    @OneToMany(mappedBy = "customer")
    List<Project> projects;

    public Customer() {
    }

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

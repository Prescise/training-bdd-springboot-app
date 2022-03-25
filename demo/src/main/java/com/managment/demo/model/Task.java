package com.managment.demo.model;

import lombok.Data;

import java.util.Date;

@Data
public class Task {
    private Long id;
    private String name;
    private String description;
    private Date dateCreation;
    private State state;
}

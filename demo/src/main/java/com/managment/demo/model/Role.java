package com.managment.demo.model;

import lombok.Data;

@Data //permet d'avoir constructeur, getter, setter pour chaque propriété

public class Role {

    private Long id;
    private String code;
    private String description;
}

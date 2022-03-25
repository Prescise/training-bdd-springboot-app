package com.managment.demo.model;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String fullName;
    private String email;
    private String password;
    private boolean active;
    private Role role;
}

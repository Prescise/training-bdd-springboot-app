package com.managment.demo.model;

import lombok.Data;

import java.util.Date;

@Data
public class UserTask {
    private Long id;
    private Date assignmentDate;
    private User user;
    private Task task;
}

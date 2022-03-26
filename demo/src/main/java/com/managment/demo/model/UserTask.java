package com.managment.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class UserTask {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date assignmentDate;
    @ManyToOne
    private User user;
    @ManyToOne
    private Task task;
}

package com.managment.demo.service;

import com.managment.demo.model.UserTask;

import java.util.List;

public interface UserTaskService {
    UserTask findOne(Long id);

    List<UserTask> findAll();

    void save(UserTask userTask);

    void update(UserTask userTask);

    Long delete(Long id);

    Long delete(UserTask userTask);
}

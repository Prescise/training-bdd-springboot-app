package com.managment.demo.service;

import com.managment.demo.model.UserTask;

import java.util.List;
import java.util.Optional;

public interface UserTaskService {
    Optional<UserTask> findOne(Long id);

    List<UserTask> findAll();

    void save(UserTask userTask);

    void update(UserTask userTask);

    void delete(Long id);

    void delete(UserTask userTask);
}

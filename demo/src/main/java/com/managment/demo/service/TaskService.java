package com.managment.demo.service;

import com.managment.demo.model.Task;

import java.util.List;

public interface TaskService {
    Task findOne(Long id);

    List<Task> findAll();

    void save(Task task);

    void update(Task task);

    void delete(Long id);

    void delete(Task task);
}

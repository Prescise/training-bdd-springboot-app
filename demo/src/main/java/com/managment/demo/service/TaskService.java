package com.managment.demo.service;

import com.managment.demo.model.Task;

import java.util.List;
import java.util.Optional;

public interface TaskService {
    Optional<Task> findOne(Long id);

    List<Task> findAll();

    void save(Task task);

    void update(Task task);

    void delete(Long id);

    void delete(Task task);
}

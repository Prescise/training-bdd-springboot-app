package com.managment.demo.service.impl;

import com.managment.demo.model.Task;
import com.managment.demo.repository.TaskRepository;
import com.managment.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class TaskServiceImpl implements TaskService {

    @Autowired
    TaskRepository repository;

    @Override
    public Optional<Task> findOne(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Task> findAll() {
        return repository.findAll();
    }

    @Override
    public void save(Task task) {
        repository.save(task);
    }

    @Override
    public void update(Task task) {
        repository.save(task);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void delete(Task task) {
        repository.delete(task);
    }
}

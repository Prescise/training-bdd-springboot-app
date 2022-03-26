package com.managment.demo.service.impl;

import com.managment.demo.model.UserTask;
import com.managment.demo.repository.UserTaskRepository;
import com.managment.demo.service.UserTaskService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class UserTaskServiceImpl implements UserTaskService {

    @Autowired
    UserTaskRepository repository;

    @Override
    public Optional<UserTask> findOne(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<UserTask> findAll() {
        return repository.findAll();
    }

    @Override
    public void save(UserTask userTask) {
        repository.save(userTask);
    }

    @Override
    public void update(UserTask userTask) {
        repository.save(userTask);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void delete(UserTask userTask) {
        repository.delete(userTask);
    }
}

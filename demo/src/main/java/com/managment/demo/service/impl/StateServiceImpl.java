package com.managment.demo.service.impl;

import com.managment.demo.model.State;
import com.managment.demo.repository.StateRepository;
import com.managment.demo.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class StateServiceImpl implements StateService {

    @Autowired
    StateRepository repository;

    @Override
    public Optional<State> findOne(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<State> findAll() {
        return repository.findAll();
    }

    @Override
    public void save(State state) {
        repository.save(state);
    }

    @Override
    public void update(State state) {
        repository.save(state);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void delete(State state) {
        repository.delete(state);
    }

}

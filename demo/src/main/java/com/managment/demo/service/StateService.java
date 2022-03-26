package com.managment.demo.service;

import com.managment.demo.model.State;

import java.util.List;

public interface StateService {
    State findOne(Long id);

    List<State> findAll();

    void save(State state);

    void update(State state);

    void delete(Long id);

    void delete(State state);
}

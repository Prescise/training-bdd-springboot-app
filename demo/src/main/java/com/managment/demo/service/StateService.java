package com.managment.demo.service;

import com.managment.demo.model.State;

import java.util.List;
import java.util.Optional;

public interface StateService {
    Optional<State> findOne(Long id);

    List<State> findAll();

    void save(State state);

    void update(State state);

    void delete(Long id);

    void delete(State state);
}

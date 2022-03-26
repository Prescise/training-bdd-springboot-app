package com.managment.demo.service;

import com.managment.demo.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    Optional<User> findOne(Long id);

    List<User> findAll();

    void save(User user);

    void update(User user);

    void delete(Long id);

    void delete(User user);
}

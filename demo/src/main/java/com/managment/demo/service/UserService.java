package com.managment.demo.service;

import com.managment.demo.model.User;

import java.util.List;

public interface UserService {
    User findOne(Long id);

    List<User> findAll();

    void save(User user);

    void update(User user);

    Long delete(Long id);

    Long delete(User user);
}

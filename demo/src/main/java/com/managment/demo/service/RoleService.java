package com.managment.demo.service;

import com.managment.demo.model.Role;

import java.util.List;
import java.util.Optional;

public interface RoleService {
    Optional<Role> findOne(Long id);

    List<Role> findAll();

    void save(Role role);

    void update(Role role);

    void delete(Long id);

    void delete(Role role);
}

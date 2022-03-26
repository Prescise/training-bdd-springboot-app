package com.managment.demo.service;

import com.managment.demo.model.Role;

import java.util.List;

public interface RoleService {
    Role findOne(Long id);

    List<Role> findAll();

    void save(Role role);

    void update(Role role);

    void delete(Long id);

    void delete(Role role);
}

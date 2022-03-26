package com.managment.demo.service.impl;

import com.managment.demo.model.Role;
import com.managment.demo.repository.RoleRepository;
import com.managment.demo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleRepository repository;

    @Override
    public Optional<Role> findOne(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Role> findAll() {
        return repository.findAll();
    }

    @Override
    public void save(Role role) {
        repository.save(role);
    }

    @Override
    public void update(Role role) {
        repository.save(role);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void delete(Role role) {
        repository.delete(role);
    }
}

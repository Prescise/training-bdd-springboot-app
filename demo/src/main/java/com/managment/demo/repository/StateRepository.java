package com.managment.demo.repository;

import com.managment.demo.model.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}

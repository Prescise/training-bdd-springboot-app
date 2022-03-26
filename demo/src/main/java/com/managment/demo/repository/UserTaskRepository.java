package com.managment.demo.repository;

import com.managment.demo.model.UserTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTaskRepository extends JpaRepository<UserTask, Long> {
}

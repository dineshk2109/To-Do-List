package com.dev.todoapp.repository;

import com.dev.todoapp.entity.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface todoRepository extends JpaRepository<ToDo,Long> {
}

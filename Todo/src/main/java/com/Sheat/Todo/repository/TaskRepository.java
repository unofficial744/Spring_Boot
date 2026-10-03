package com.Sheat.Todo.repository;

import com.Sheat.Todo.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
public interface TaskRepository extends JpaRepository <Task, Long> {

    
    
}

package de.danielmeint.taskmanagerbackend.repository;

import de.danielmeint.taskmanagerbackend.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    // Basic CRUD methods are automatically implemented
}


package com.horacioing.todoappmvc.persistence.repositories;

import com.horacioing.todoappmvc.persistence.models.Task;
import com.horacioing.todoappmvc.persistence.models.TaskStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
    Page<Task> findAllByTaskStatus(TaskStatus status, Pageable pagination);
}

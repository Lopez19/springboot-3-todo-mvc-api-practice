package com.horacioing.todoappmvc.services;

import com.horacioing.todoappmvc.mappers.TaskInDTOToTask;
import com.horacioing.todoappmvc.persistence.models.Task;
import com.horacioing.todoappmvc.persistence.repositories.TaskRepository;
import com.horacioing.todoappmvc.services.DTO.TaskInDTO;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Service
@AllArgsConstructor
public class TaskService {
    private final TaskRepository taskRepository;
    private final TaskInDTOToTask mapper;

    public ResponseEntity<Task> createTask(
            TaskInDTO dataIn,
            UriComponentsBuilder uriComponentsBuilder
    ) {
        Task task = this.taskRepository.save(this.mapper.map(dataIn));
        URI uri = uriComponentsBuilder.path("/task/{taskId}").buildAndExpand(task.getId()).toUri();
        return ResponseEntity.created(uri).body(task);
    }

    public ResponseEntity<Page<Task>> getAllTask(
            Pageable pagination
    ){
        return ResponseEntity.ok(this.taskRepository.findAll(pagination));
    }
}

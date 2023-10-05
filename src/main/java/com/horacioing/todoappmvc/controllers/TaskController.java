package com.horacioing.todoappmvc.controllers;

import com.horacioing.todoappmvc.persistence.models.Task;
import com.horacioing.todoappmvc.services.DTO.TaskInDTO;
import com.horacioing.todoappmvc.services.TaskService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/task")
@AllArgsConstructor
@Tag(name = "Endpoint: Tasks")
public class TaskController {
    private final TaskService taskService;

    @PostMapping
    public ResponseEntity<Task> createTask(
            @RequestBody
            TaskInDTO dataIn,
            UriComponentsBuilder uriComponentsBuilder
    ){
        return this.taskService.createTask(dataIn, uriComponentsBuilder);
    }

    @GetMapping
    public ResponseEntity<Page<Task>> getAllTask(
            Pageable pagination
    ){
        return this.taskService.getAllTask(pagination);
    }
}

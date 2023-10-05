package com.horacioing.todoappmvc.mappers;

import com.horacioing.todoappmvc.persistence.models.Task;
import com.horacioing.todoappmvc.persistence.models.TaskStatus;
import com.horacioing.todoappmvc.services.DTO.TaskInDTO;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class TaskInDTOToTask implements IMapper<TaskInDTO, Task> {

    @Override
    public Task map(TaskInDTO in) {
        return Task.builder()
                .title(in.title())
                .description(in.description())
                .eta(in.eta())
                .taskStatus(TaskStatus.ON_TIME)
                .createDate(LocalDateTime.now())
                .finished(false)
                .build();
    }
}

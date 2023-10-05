package com.horacioing.todoappmvc.persistence.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity(name = "Task")
@Table(name = "tasks")
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private LocalDateTime createDate;
    private LocalDateTime eta;
    private Boolean finished;
    @Enumerated(EnumType.STRING)
    private TaskStatus taskStatus;
}

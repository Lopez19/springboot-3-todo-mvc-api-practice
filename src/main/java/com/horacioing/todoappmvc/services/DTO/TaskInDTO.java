package com.horacioing.todoappmvc.services.DTO;

import java.time.LocalDateTime;

public record TaskInDTO(
        String title,
        String description,
        LocalDateTime eta
) {
}

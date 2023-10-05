package com.horacioing.todoappmvc.context;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Task API",
                description = "API Rest de Tareas",
                version = "Beta",
                license = @License(
                        name = "Licence Name",
                        url = "https://some-url.com"
                ),
                contact = @Contact(
                        name = "Ing. Horacio",
                        url = "https://horacioing.com",
                        email = "hola@horacioing.com"
                ),
                termsOfService = "Terms of service"
        ),
        externalDocs = @ExternalDocumentation(
                description = "External Wiki Documentation",
                url = "https://wikidoc.com"
        ),
        servers = {
                @Server(
                        description = "Local ENV",
                        url = "http://localhost:8080"
                )
        }
)
public class SwaggerConfig {
}

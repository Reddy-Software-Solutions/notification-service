package com.malli.notificationservice;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Notification Service", description = "This is a Spring Boot Notification Microservice"))
//@OpenAPIDefinition(info = @Info(title = "Notification Service", description = "This is a Spring Boot Notification Microservice"), security = @SecurityRequirement(name = "AUTHORIZATION"))
//@SecurityScheme(name = "AUTHORIZATION", scheme = "api_key", type = SecuritySchemeType.APIKEY, in = SecuritySchemeIn.HEADER, paramName = "secretKey")
@SuppressWarnings("checkstyle:HideUtilityClassConstructor")
public class NotificationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotificationServiceApplication.class, args);
    }

}

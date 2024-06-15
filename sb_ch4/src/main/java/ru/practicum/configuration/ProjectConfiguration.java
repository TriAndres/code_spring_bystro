package ru.practicum.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
@ComponentScan(
        basePackages = {"ru.practicum.proxies", "ru.practicum.services", "ru.practicum.repositories"}
)
public class ProjectConfiguration {
}


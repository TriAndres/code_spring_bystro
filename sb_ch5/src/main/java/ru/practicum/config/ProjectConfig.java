package ru.practicum.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"ru.practicum.service", "ru.practicum.repositories"})
public class ProjectConfig {

}

package ru.practicum.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.practicum.config.ProjectConfig;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
    }
}

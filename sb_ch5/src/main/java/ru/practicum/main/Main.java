package ru.practicum.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.practicum.config.ProjectConfig;
import ru.practicum.service.CommentService;
import ru.practicum.service.UserService;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext c =
                new AnnotationConfigApplicationContext(ProjectConfig.class);
        var s1 = c.getBean(CommentService.class);
        var s2 = c.getBean(UserService.class);

        boolean b = s1.getCommentRepository() == s2.getCommentRepository();

        System.out.println(b);
    }
}

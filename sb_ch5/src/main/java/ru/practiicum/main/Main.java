package ru.practiicum.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.practiicum.config.ProjectConfig;
import ru.practiicum.service.CommentService;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext c =
                new AnnotationConfigApplicationContext(ProjectConfig.class);
        var cs1 = c.getBean("commentService", CommentService.class);
        var cs2 = c.getBean("commentService", CommentService.class);

        boolean b1 = cs1 == cs2;

        System.out.println(b1);
    }
}

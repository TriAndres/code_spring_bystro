package ru.practicum.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.practicum.configuration.ProjectConfiguration;
import ru.practicum.model.Comment;
import ru.practicum.proxies.EmailCommentNotificationProxy;
import ru.practicum.repositories.DBCommentRepository;
import ru.practicum.services.CommentService;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                 new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        Comment comment = new Comment();
        comment.setAuthor("Laurentiu");
        comment.setText("Demo comment");
        CommentService commentService =context.getBean(CommentService.class);
        commentService.publishComment(comment);

    }
}

package ru.practicum.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.practicum.proxies.CommentNotificationProxy;
import ru.practicum.proxies.EmailCommentNotificationProxy;
import ru.practicum.repositories.CommentRepository;
import ru.practicum.repositories.DBCommentRepository;
import ru.practicum.services.CommentService;


@Configuration
public class ProjectConfiguration {
    @Bean
    public CommentRepository commentRepository() {
        return new DBCommentRepository();
    }

    @Bean
    public CommentNotificationProxy commentNotificationProxy() {
        return new EmailCommentNotificationProxy();
    }

    @Bean
    public CommentService commentService(
            CommentRepository commentRepository,
            CommentNotificationProxy commentNotificationProxy
    ) {
        return new CommentService(commentRepository,
                commentNotificationProxy);
    }
}


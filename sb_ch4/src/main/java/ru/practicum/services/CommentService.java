package ru.practicum.services;

import org.springframework.stereotype.Component;
import ru.practicum.model.Comment;
import ru.practicum.proxies.CommentNotificationProxy;
import ru.practicum.repositories.CommentRepository;
@Component
public class CommentService {
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
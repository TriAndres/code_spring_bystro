package ru.practiicum.services;

import org.springframework.stereotype.Component;
import ru.practiicum.model.Comment;
import ru.practiicum.proxies.CommentNotificationProxy;
import ru.practiicum.repositories.CommentRepository;
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

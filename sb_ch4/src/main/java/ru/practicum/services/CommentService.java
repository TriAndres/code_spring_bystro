package ru.practicum.services;

import org.springframework.stereotype.Service;
import ru.practicum.model.Comment;
import ru.practicum.proxies.CommentNotificationProxy;
import ru.practicum.repositories.CommentRepository;
@Service
public class CommentService {

    private CommentRepository commentRepository;

    private CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}

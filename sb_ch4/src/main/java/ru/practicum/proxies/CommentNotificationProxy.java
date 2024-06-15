package ru.practicum.proxies;

import ru.practicum.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}

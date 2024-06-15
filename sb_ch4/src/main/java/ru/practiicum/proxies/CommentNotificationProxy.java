package ru.practiicum.proxies;

import ru.practiicum.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}

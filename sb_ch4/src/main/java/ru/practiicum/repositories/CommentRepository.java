package ru.practiicum.repositories;

import ru.practiicum.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}

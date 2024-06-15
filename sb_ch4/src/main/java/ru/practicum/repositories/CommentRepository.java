package ru.practicum.repositories;

import ru.practicum.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}

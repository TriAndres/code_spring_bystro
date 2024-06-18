package ru.practicum.repositories;

import org.springframework.stereotype.Repository;
import ru.practicum.model.Comment;
@Repository
public class DBCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
}

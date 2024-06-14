package ru.practiicum.repositories;

import org.springframework.stereotype.Component;
import ru.practiicum.model.Comment;
@Component
public class DBCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
}

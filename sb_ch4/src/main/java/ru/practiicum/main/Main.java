package ru.practiicum.main;

import ru.practiicum.model.Comment;
import ru.practiicum.proxies.EmailCommentNotificationProxy;
import ru.practiicum.repositories.DBCommentRepository;
import ru.practiicum.services.CommentService;

public class Main {
    public static void main(String[] args) {
        DBCommentRepository commentRepository =
                new DBCommentRepository();
        EmailCommentNotificationProxy commentNotificationProxy =
                new EmailCommentNotificationProxy();
        CommentService commentService =
                new CommentService(commentRepository, commentNotificationProxy);
        Comment comment = new Comment();
        comment.setAuthor("Laurentiu");
        comment.setText("Demo comment");
        commentService.publishComment(comment);

    }
}

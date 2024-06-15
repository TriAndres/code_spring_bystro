package ru.practiicum.proxies;

import org.springframework.stereotype.Component;
import ru.practiicum.model.Comment;

public class EmailCommentNotificationProxy implements  CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: " + comment.getText());
    }
}

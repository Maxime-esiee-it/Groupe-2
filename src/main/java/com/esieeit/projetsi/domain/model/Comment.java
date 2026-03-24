package com.esieeit.projetsi.domain.model;

import com.esieeit.projetsi.domain.validation.Validators;

public class Comment {
    private String content;
    private Task task;
    private User author;

    public Comment(String content, Task task, User author) {
        setContent(content);
        setTask(task);
        setAuthor(author);
    }

    public String getContent() { return content; }

    public final void setContent(String content) {
        this.content = Validators.requireNonBlank(content, "comment.content", 1, 500);
    }

    public Task getTask() { return task; }

    public final void setTask(Task task) {
        Validators.requireNonNull(task, "comment.task");
        this.task = task;
    }

    public User getAuthor() { return author; }

    public final void setAuthor(User author) {
        Validators.requireNonNull(author, "comment.author");
        this.author = author;
    }
}

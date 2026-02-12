package com.esieeit.projetsi.domain.model;

import com.esieeit.projetsi.domain.enums.TaskStatus;
import com.esieeit.projetsi.domain.exception.BusinessRuleException;
import com.esieeit.projetsi.domain.validation.Validators;

public class Task {
    private String title;
    private String description;
    private Project project;
    private TaskStatus status;

    public Task(String title, String description, Project project) {
        this.title = Validators.requireNonBlank(title, "title", 1, 200);
        this.description = description;
        this.project = Validators.requireNonNull(project, "project");
        this.status = TaskStatus.TODO;
        project.addTask(this);
    }

    public TaskStatus getStatus() { return status; }

    public void start() {
        if (status != TaskStatus.TODO)
            throw new BusinessRuleException("Transition interdite: start() possible uniquement depuis TODO");
        status = TaskStatus.IN_PROGRESS;
    }

    public void complete() {
        if (status != TaskStatus.IN_PROGRESS)
            throw new BusinessRuleException(
                    "Transition interdite: complete() possible uniquement depuis IN_PROGRESS");
        status = TaskStatus.DONE;
    }

    public void archive() {
        if (status != TaskStatus.DONE)
            throw new BusinessRuleException(
                    "Transition interdite: archive() possible uniquement depuis DONE");
        status = TaskStatus.ARCHIVED;
    }
}

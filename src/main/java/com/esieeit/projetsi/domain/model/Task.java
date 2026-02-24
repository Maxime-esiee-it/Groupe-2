package com.esieeit.projetsi.domain.model;

import com.esieeit.projetsi.domain.enums.TaskStatus;
import com.esieeit.projetsi.domain.exception.BusinessRuleException;
import com.esieeit.projetsi.domain.validation.Validators;

public class Task {

    private Long id; // <-- ajouter l'id
    private String title;
    private String description;
    private Project project;
    private TaskStatus status;

    // Constructeur avec Project (comme avant)
    public Task(String title, String description, Project project) {
        this.title = Validators.requireNonBlank(title, "title", 1, 200);
        this.description = description;
        this.project = Validators.requireNonNull(project, "project");
        this.status = TaskStatus.TODO;
        project.addTask(this);
    }

    // Nouveau constructeur simplifié pour TaskService
    public Task(String title, String description) {
        this.title = Validators.requireNonBlank(title, "title", 1, 200);
        this.description = description;
        this.status = TaskStatus.TODO;
    }

    // Getter / Setter Id
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    // Getter / Setter Title
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    // Getter / Setter Description
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    // Getter / Setter Status
    public TaskStatus getStatus() { return status; }
    public void setStatus(TaskStatus status) { this.status = status; }

    // Getter / Setter Project si nécessaire
    public Project getProject() { return project; }
    public void setProject(Project project) { this.project = project; }

    // Méthodes métier
    public void start() {
        if (status != TaskStatus.TODO)
            throw new BusinessRuleException("Transition interdite: start() possible uniquement depuis TODO");
        status = TaskStatus.IN_PROGRESS;
    }

    public void complete() {
        if (status != TaskStatus.IN_PROGRESS)
            throw new BusinessRuleException("Transition interdite: complete() possible uniquement depuis IN_PROGRESS");
        status = TaskStatus.DONE;
    }

    public void archive() {
        if (status != TaskStatus.DONE)
            throw new BusinessRuleException("Transition interdite: archive() possible uniquement depuis DONE");
        status = TaskStatus.ARCHIVED;
    }
}
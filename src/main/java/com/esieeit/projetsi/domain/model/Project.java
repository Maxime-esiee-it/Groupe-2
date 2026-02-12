package com.esieeit.projetsi.domain.model;

import java.util.ArrayList;
import java.util.List;
import com.esieeit.projetsi.domain.validation.Validators;

public class Project {
    private String name;
    private String description;
    private User owner;
    private List<Task> tasks = new ArrayList<>();

    public Project(String name, String description, User owner) {
        this.name = Validators.requireNonBlank(name, "name", 1, 200);
        this.description = description;
        this.owner = Validators.requireNonNull(owner, "owner");
    }

    public void addTask(Task task) {
        Validators.requireNonNull(task, "task");
        tasks.add(task);
    }

    public List<Task> getTasks() {
        return new ArrayList<>(tasks);
    }
}

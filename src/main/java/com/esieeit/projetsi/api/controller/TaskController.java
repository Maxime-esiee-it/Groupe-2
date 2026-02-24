package com.esieeit.projetsi.api.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.esieeit.projetsi.api.dto.TaskCreateRequest;
import com.esieeit.projetsi.api.dto.TaskResponse;
import com.esieeit.projetsi.api.dto.TaskUpdateRequest;
import com.esieeit.projetsi.api.mapper.TaskMapper;
import com.esieeit.projetsi.domain.model.Task;
import com.esieeit.projetsi.service.TaskService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    // 🔹 Lister toutes les tâches
    @GetMapping
    public List<TaskResponse> getAll() {
        return taskService.getAll()
                .stream()
                .map(TaskMapper::toResponse)
                .collect(Collectors.toList());
    }

    // 🔹 Récupérer une tâche par ID
    @GetMapping("/{id}")
    public TaskResponse getById(@PathVariable Long id) {
        Task task = taskService.getById(id);
        return TaskMapper.toResponse(task);
    }

    // 🔹 Créer une nouvelle tâche
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TaskResponse create(@Valid @RequestBody TaskCreateRequest req) {
        Task task = taskService.create(req);
        return TaskMapper.toResponse(task);
    }

    //  Mettre à jour une tâche existante
    @PutMapping("/{id}")
    public TaskResponse update(@PathVariable Long id, @Valid @RequestBody TaskUpdateRequest req) {
        Task task = taskService.update(id, req);
        return TaskMapper.toResponse(task);
    }

    //  Supprimer une tâche
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        taskService.delete(id);
    }
}
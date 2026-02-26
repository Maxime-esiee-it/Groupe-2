package com.esieeit.projetsi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.esieeit.projetsi.api.dto.TaskCreateRequest;
import com.esieeit.projetsi.api.dto.TaskUpdateRequest;
import com.esieeit.projetsi.domain.enums.TaskStatus;
import com.esieeit.projetsi.domain.exception.BusinessRuleException;
import com.esieeit.projetsi.domain.exception.ResourceNotFoundException;
import com.esieeit.projetsi.domain.model.Task;
import com.esieeit.projetsi.domain.validation.Validators;
import com.esieeit.projetsi.repository.TaskRepository;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task create(TaskCreateRequest req) {
        Validators.requireNonNull(req, "request");

        Task task = new Task(
                req.getTitle(),
                req.getDescription()
        );

        task.setStatus(TaskStatus.TODO);

        return taskRepository.save(task);
    }

    public List<Task> getAll() {
        return taskRepository.findAll();
    }

    public Task getById(Long id) {
        Validators.requireNonNull(id, "id");

        return taskRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Task introuvable : " + id));
    }

    public Task update(Long id, TaskUpdateRequest req) {
        Validators.requireNonNull(id, "id");
        Validators.requireNonNull(req, "request");

        Task task = getById(id);

        if (req.getTitle() != null) {
            task.setTitle(req.getTitle());
        }

        if (req.getDescription() != null) {
            task.setDescription(req.getDescription());
        }

        if (req.getStatus() != null) {
            try {
                task.setStatus(TaskStatus.valueOf(req.getStatus()));
            } catch (IllegalArgumentException e) {
                throw new BusinessRuleException("Statut invalide : " + req.getStatus());
            }
        }

        return taskRepository.save(task);
    }

    public void delete(Long id) {
        if (!taskRepository.existsById(id)) {
            throw new ResourceNotFoundException("Task introuvable : " + id);
        }
        taskRepository.deleteById(id);
    }
}
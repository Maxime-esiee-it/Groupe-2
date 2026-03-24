package com.esieeit.projetsi.repository;

import java.util.List;
import java.util.Optional;
import com.esieeit.projetsi.domain.model.Task;

public interface TaskRepository {

    Task save(Task task);

    Optional<Task> findById(Long id);

    List<Task> findAll();

    void deleteById(Long id);

    boolean existsById(Long id);
}

package com.esieeit.projetsi.domain;

import java.util.Set;

import com.esieeit.projetsi.domain.enums.UserRole;
import com.esieeit.projetsi.domain.model.Project;
import com.esieeit.projetsi.domain.model.Task;
import com.esieeit.projetsi.domain.model.User;

public class Demo {
    public static void main(String[] args) {
        User u = new User("alice@example.com", "alice", Set.of(UserRole.USER));
        Project p = new Project("Projet SI", "Gestion projets/tâches", u);
        Task t = new Task("Initialiser le repo", "Créer Gradle + README", p);
        Task t2 = new Task("Bug", null, p);

        System.out.println("Projet: " + p.getTasks().size() + " tâches créées.");
    }
}

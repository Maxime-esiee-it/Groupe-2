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

        // On crée les tâches
        new Task("Initialiser le repo", "Créer Gradle + README", p);
        new Task("Bug", "Description de la tâche Bug", p);

        // On affiche toutes les tâches du projet
        System.out.println("Projet: " + p.getName());
        System.out.println("Description: " + p.getDescription());
        System.out.println("Propriétaire: " + p.getOwner().getUsername());
        System.out.println("Tâches:");
        for (Task task : p.getTasks()) {
            System.out.println("- " + task.getTitle() + " [" + task.getStatus() + "]");
        }
    }
}

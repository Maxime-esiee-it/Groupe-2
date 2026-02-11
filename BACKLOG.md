\# Backlog MVP - Projet SI Java


\# projet du groupe :
Le projet a pour but de creer une application/site de gestion de taches avec un calendrier.

User story :

En tant qu’utilisateur,
je veux ajouter une nouvelle tâche,
pour pouvoir noter ce que je dois faire.

En tant qu’utilisateur,
je veux voir toutes mes tâches,
pour connaître ce qu'il me reste à faire.

En tant qu’utilisateur,
je veux cocher une tâche comme terminée,
pour savoir ce qui est fait et ce qui reste.

En tant qu’utilisateur,
je veux supprimer une tâche,
pour garder ma liste propre.

\## US- Créer une tache

Feature: Création de tâche
  Scenario: L'utilisateur crée une nouvelle tâche
    Given L'utilisateur est connecté
    And Il est sur la page "Créer une tâche"
    When Il saisit un titre et une description
    And Il clique sur "Créer"
    Then La tâche apparaît dans la liste de ses tâches
    And Un message "Tâche créée" s'affiche

\## US- Marquer une tâche comme terminée

Feature: Compléter une tâche
  Scenario: L'utilisateur coche une tâche
    Given L'utilisateur voit une tâche non terminée
    When Il clique sur l’icône "✔"
    Then La tâche change de statut à "terminée"
    And Elle est affichée barrée ou dans la section "Terminées"

\## US- BackEnd

Créer projet Spring Boot
 Configurer base de données (MySQL)
 Mettre en place Hibernate / JPA
 Créer entité User
 Créer entité Task
 Créer entité Project (optionnel)
 Créer Repositories
 Créer Services
 Créer Controllers (API REST)
 Implémenter la sécurité (Spring Security + JWT)
 Ajouter validation (Bean Validation)
 Tests unitaires (JUnit, Mockito)

\## US- FrontEnd

 Création du projet (Vite / React / Angular / autre)
 Créer les pages : Login, Register, Dashboard, Liste des tâches
 Intégration API REST
 Gestion du token JWT
 Gestion des erreurs
 Interface responsive

\## US-01 Init

Initialisation du projet Java et GitHub



\## US-02 Register

Création d’un utilisateur



\## US-03 Login

Connexion d’un utilisateur



\## US-04 CRUD Project

Créer / Lire / Mettre à jour / Supprimer un projet



\## US-05 CRUD Task

Créer / Lire / Mettre à jour / Supprimer une tâche




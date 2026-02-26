# Backlog MVP - Projet SI Java


# projet du groupe :
Le projet a pour but de creer une application/site de gestion de taches avec un calendrier.

## US-01 User story :

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

## US-02 Créer une tâche

Feature: Création de tâche
  Scenario: L'utilisateur crée une nouvelle tâche
    Given L'utilisateur est connecté
    And Il est sur la page "Créer une tâche"
    When Il saisit un titre et une description
    And Il clique sur "Créer"
    Then La tâche apparaît dans la liste de ses tâches
    And Un message "Tâche créée" s'affiche

## US- Modifié une tâche deja créer
Feature: Modifié une tâche
  Scenario: L'utilisateur modifie une tâche
    Given L'utilisateur veut modifié une tache qui est créer
    When Il clique sur "mofifié"
    And La tâche est modifié

## US-03 Marquer une tâche comme terminée

Feature: Compléter une tâche
  Scenario: L'utilisateur coche une tâche
    Given L'utilisateur voit une tâche non terminée
    When Il clique sur l’icône "✔"
    Then La tâche change de statut à "terminée"
    And Elle est affichée barrée ou dans la section "Terminées"

## US-04 BackEnd

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

## US-05 FrontEnd

 Création du projet (Vite / React / Angular / autre)
 Créer les pages : Login, Register, Dashboard, Liste des tâches
 Intégration API REST
 Gestion du token JWT
 Gestion des erreurs
 Interface responsive

=======
# Backlog MVP - Projet SI Java
>>>>>>> ace978f20c221aa4b18516b233dc3b3320639173

## US-06 Init
Initialisation du projet Java et GitHub

## US-07 Register
Création d’un utilisateur

## US-08 Login
Connexion d’un utilisateur

## US-09 CRUD Project
Créer / Lire / Mettre à jour / Supprimer un projet

## US-10 CRUD Task
Créer / Lire / Mettre à jour / Supprimer une tâche


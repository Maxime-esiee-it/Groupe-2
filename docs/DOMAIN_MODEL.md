# DOMAIN MODEL

## 1. Acteurs

- User : utilisateur authentifié
- Admin : administrateur
- System : système automatique (notifications)

---

## 2. Cas d’usage

UC-01 : En tant que User, je veux créer un projet afin de suivre mon travail.  
UC-02 : En tant que User, je veux lister mes projets afin de les consulter.  
UC-03 : En tant que User, je veux ajouter une tâche à un projet afin de planifier.  
UC-04 : En tant que User, je veux changer le statut d’une tâche afin de suivre son avancement.  
UC-05 : En tant que User, je veux ajouter un commentaire à une tâche afin de collaborer.  
UC-06 : En tant que User, je veux assigner une tâche à un utilisateur.  
UC-07 : En tant que User, je veux archiver une tâche terminée.  
UC-08 : En tant que Admin, je veux gérer les utilisateurs.

---

## 3. Entités

- User  
- Project  
- Task  
- Comment  
- Role  

---

## 4. Attributs et types

### User
- id : Long  
- username : String  
- email : String  
- role : Role  

### Project
- id : Long  
- name : String  
- description : String  
- owner : User  

### Task
- id : Long  
- title : String  
- description : String  
- status : TaskStatus  
- dueDate : LocalDate  
- project : Project  
- assignedTo : User  

### Comment
- id : Long  
- content : String  
- createdAt : LocalDateTime  
- author : User  
- task : Task  

---

## 5. Relations et cardinalités

- User 1 ---- * Project  
- Project 1 ---- * Task  
- Task 1 ---- * Comment  
- User 1 ---- * Task (assigned)  

---

## 6. Règles métier

- Un projet doit avoir un propriétaire.  
- Une tâche doit appartenir à un projet.  
- Une tâche archivée ne peut plus être modifiée.  
- Une tâche doit avoir un statut valide.  
- Workflow : TODO → IN_PROGRESS → DONE → ARCHIVED.

---

## 7. Diagramme de classes

```mermaid
classDiagram
    User "1" --> "*" Project : owns
    Project "1" --> "*" Task
    Task "1" --> "*" Comment
    User "1" --> "*" Task : assigned

# DECISIONS

1. Utilisation d’un enum TaskStatus pour les statuts.  
2. Pas de relation ManyToMany.  
3. Les règles métier sont dans service.  
4. Les entités sont dans domain.model.  
5. Pas d’accès Controller → Repository.  
6. Workflow strict des statuts.  
7. Une tâche appartient à un projet.

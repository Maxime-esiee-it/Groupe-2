
---

##  2) Contenu à mettre dans `docs/PACKAGE_STRUCTURE.md`

```md
# PACKAGE STRUCTURE

## Structure

com.esieeit.projetsi  
├── api  
│   ├── controller  
│   └── dto  
├── domain  
│   ├── model  
│   └── enums  
├── service  
├── repository  
└── exception  

---

## Rôle des packages

- api.controller : endpoints REST  
- api.dto : DTO  
- domain.model : entités métier  
- domain.enums : enums métier  
- service : logique métier  
- repository : accès DB  
- exception : exceptions métier  

---

## Règles

- Controller → Service uniquement  
- Service → Repository  
- Pas de Controller → Repository direct  
- Domain ne dépend de rien  
- DTO sans logique métier  

---

## Type

Architecture en couches inspirée de Clean Architecture.

# Projet SI Java - ESIEE‑IT (2025‑2026)

## Contexte

Projet SI en Java : construire une API backend propre, structurée, documentée et testée, avec un workflow Git proche entreprise.

## Objectifs

- Mettre en place un dépôt Git propre (main/develop/feature)
- Implémenter un MVP (auth + gestion de ressources métier)
- Respecter une architecture claire (controleur/service/repository)
- Ajouter des tests unitaires
- Produire une documentation exploitable (README + backlog)

## Équipe

- HAMZA Nassim - rôle : Dev
- Marco Enzo - rôle :  Lead Dev
- Maxime Clement - rôle : Dev
- EL Feddi Aymane -rôle : PO
- LAJEUNE Hugo -rôle : QA

## Stack

- Java 17/21
- Maeven
- JUnit 5
- Spring Boot, DB, Docker

## Installation

-Java
-Spring Git
-Base de donnée

### Prérequis

- Java 17/21
- Git
- Docker

### Cloner

\`\`\`bash
git clone <URL>
cd <repo>
\`\`\`

## Lancer

### Tests

\`\`\`bash
./gradlew test
\`\`\`

### Run (si application Gradle)

\`\`\`bash
./gradlew run
\`\`\`

## Workflow Git

- **main** : stable
- **develop** : intégration
- **feature/** : 1 user story = 1 branche
- PR obligatoire vers develop

## Backlog

Voir `BACKLOG.md`.

## Documentation
- docs/DOMAIN_MODEL.md
- docs/PACKAGE_STRUCTURE.md
# 📘 SmartGradeApp
[![Java CI - SmartGradeApp](https://github.com/abdelhamidkada/SmartGradeApp/actions/workflows/java-ci.yml/badge.svg)](https://github.com/abdelhamidkada/SmartGradeApp/actions/workflows/java-ci.yml)

> 🇫🇷 Version française plus bas  
> 🇬🇧 English version below

---

## 🇬🇧 SmartGradeApp – Overview

SmartGradeApp is a Java console application for managing students, modules, and (later) their grades.  
It is a learning project designed to practice:

- Object-Oriented Programming (OOP)
- Java Collections (`ArrayList`)
- Layered architecture (model / service / ui)
- Maven
- Git & GitHub Actions (CI)

The project will later be extended to use **MySQL and JDBC**, and possibly exposed as an API.

---

### ✅ Current Features (v1)

#### ✔ Student Management
- Add a student
- Display all students
- Search a student by ID
- Delete a student by ID
- Check for duplicate IDs before insertion
- Clean display using `toString()`

#### ✔ Build & CI
- Maven project structure
- Automatic build on every push via GitHub Actions
- Java 17 configured in `pom.xml` and CI

---

### 🧱 Project Structure

```text
SmartGradeApp/
 ├── src/
 │   └── main/
 │       └── java/
 │           └── ma/
 │               └── smartgrade/
 │                   ├── model/        # Domain classes (Etudiant, Module, Note)
 │                   ├── service/      # Business logic (EtudiantService, etc.)
 │                   └── ui/           # Console entry point (SmartGradeApp.java)
 │
 ├── pom.xml                # Maven configuration
 ├── .gitignore             # Ignored files (Java / IDE / build)
 └── .github/
     └── workflows/
         └── java-ci.yml    # GitHub Actions (CI)
🛠 Technologies
Technology	Role
Java 17	Main programming language
Maven	Build & dependency management
Git/GitHub	Version control
GitHub Actions	Continuous Integration (CI)
IntelliJ IDEA	IDE used for development

▶ How to run the project
Compile with Maven:

bash
Copy code
mvn clean compile
Then run the SmartGradeApp main class from your IDE (IntelliJ), or later using a Maven exec plugin.

🔮 Roadmap
🟡 v2 — Module management
ModuleService

Add / list / search / delete modules

🟡 v3 — Grades management
NoteService

Link student + module + grade

Display grades for a student

Compute averages

🟡 v4 — Interactive console menu
Text menu (1 = add student, 2 = list students, etc.)

🔵 v5 — MySQL + JDBC
Database tables (student, module, note)

DAO layer

Services using the database

🔵 v6 — Web/API version (Spring Boot)
REST API

Swagger / OpenAPI

Docker support

Unit tests

👤 Author
Abdelhamid KADA
Student in SITD – Interested in backend development and Java.
GitHub: https://github.com/abdelhamidkada

🇫🇷 SmartGradeApp – Présentation
SmartGradeApp est une application console en Java pour gérer des étudiants, des modules et, plus tard, leurs notes.
C’est un projet pédagogique conçu pour pratiquer :

la Programmation Orientée Objet (POO)

les collections Java (ArrayList)

une architecture en couches (model / service / ui)

Maven

Git & GitHub Actions (Intégration Continue)

Le projet sera progressivement étendu pour utiliser MySQL + JDBC, puis éventuellement une API REST.

✅ Fonctionnalités actuelles (v1)
✔ Gestion des étudiants
Ajouter un étudiant

Afficher la liste des étudiants

Rechercher un étudiant par ID

Supprimer un étudiant par ID

Vérification de doublons (ID déjà existant)

Affichage lisible grâce à toString()

✔ Build & CI
Projet Maven structuré

Build automatique à chaque push via GitHub Actions

Java 17 configuré dans pom.xml et dans le workflow CI

🧱 Structure du projet
text
Copy code
SmartGradeApp/
 ├── src/
 │   └── main/
 │       └── java/
 │           └── ma/
 │               └── smartgrade/
 │                   ├── model/        # Classes métier (Etudiant, Module, Note)
 │                   ├── service/      # Logique métier (EtudiantService, etc.)
 │                   └── ui/           # Point d’entrée console (SmartGradeApp.java)
 │
 ├── pom.xml                # Configuration Maven
 ├── .gitignore             # Fichiers ignorés (Java / IDE / build)
 └── .github/
     └── workflows/
         └── java-ci.yml    # Workflow GitHub Actions (CI)
🛠 Technologies utilisées
Technologie	Rôle
Java 17	Langage principal
Maven	Build & gestion des dépendances
Git / GitHub	Gestion de versions
GitHub Actions	Intégration Continue (CI)
IntelliJ IDEA	IDE utilisé pour le développement

▶ Comment exécuter le projet
Compilation avec Maven :

bash
Copy code
mvn clean compile
Ensuite, exécuter la classe SmartGradeApp (méthode main) depuis IntelliJ
ou via Maven plus tard avec un plugin d’exécution.

🔮 Roadmap (évolution prévue)
🟡 v2 — Gestion des modules
ModuleService

Ajout / liste / recherche / suppression des modules

🟡 v3 — Gestion des notes
NoteService

Lier étudiant + module + note

Afficher les notes d’un étudiant

Calcul de moyennes

🟡 v4 — Menu console interactif
Menu texte avec choix (1 = ajouter étudiant, 2 = afficher, etc.)

🔵 v5 — Version base de données MySQL (JDBC)
Tables étudiant / module / note

DAO + services connectés à la BD

🔵 v6 — Version web / API (Spring Boot)
API REST

Documentation Swagger

Docker

Tests unitaires

👤 Auteur
Abdelhamid KADA
Étudiant en SITD — Passionné par le développement backend & Java.
GitHub : https://github.com/abdelhamidkada
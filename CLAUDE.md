# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Repository Overview

This is an Eclipse workspace containing multiple Java learning projects. All projects are organized under the `projects/` directory. The primary project is a Spring Boot quiz system application, with additional lab exercises and practice projects.

**Git Repository:** This repository is located at `eclipse-workspace/` (not at the Windows user home directory level).

## Repository Structure

```
eclipse-workspace/
├── .git/                     # Git repository root
├── .gitignore                # Comprehensive ignore file for Java/Eclipse/Maven
├── README.md                 # Repository overview
├── .metadata/                # Eclipse workspace metadata (ignored by git)
└── projects/                 # All projects go here
    ├── quiz-system/          # Main Spring Boot application
    ├── arrays/               # Array manipulation exercises
    ├── centeralTester/       # Testing scripts
    ├── labs_Week_2/          # Week 2 lab exercises
    ├── labs_week_2Repository/
    ├── week3git/             # Git practice
    ├── resumeCode/           # Resume code exercises
    └── myfirstjavascript/    # Java practice project
```

## Primary Project: Quiz System

**Location:** `projects/quiz-system/`

A Spring Boot REST API application for an EdTech quiz platform built for students and teachers.

### Technology Stack
- **Framework:** Spring Boot 4.0.0-M3
- **Java Version:** 21
- **Build Tool:** Maven
- **Database:** H2 (in-memory)
- **ORM:** Spring Data JPA
- **Dependencies:**
  - spring-boot-starter-webmvc
  - spring-boot-starter-data-jpa
  - spring-boot-devtools
  - h2database

### Architecture

**Package:** `com.studybuddy.quiz_system`

The application follows a standard Spring Boot layered architecture:

1. **Entity Layer** (`Quiz.java`): JPA entities representing database tables
   - Quiz entity with fields: id, title, description, subject, createdDate

2. **Repository Layer** (`QuizRepository.java`): Spring Data JPA repositories
   - Extends JpaRepository for automatic CRUD operations

3. **Controller Layer** (`QuizController.java`): REST endpoints
   - Mapped to `/api/quizzes`
   - Provides GET (all/by-id), POST, DELETE operations

4. **Application Entry** (`QuizSystemApplication.java`): Spring Boot main class

### Build and Run Commands

**Navigate to project directory first:**
```bash
cd eclipse-workspace/projects/quiz-system
```

**Build the project:**
```bash
./mvnw clean package
```

**Run the application:**
```bash
./mvnw spring-boot:run
```

**Run tests:**
```bash
./mvnw test
```

**Run specific test:**
```bash
./mvnw test -Dtest=QuizSystemApplicationTests
```

### Development Workflow

**Using Spring Boot DevTools:** The application includes spring-boot-devtools, which enables automatic restart when files are modified during development.

**Database:** H2 console available at `http://localhost:8080/h2-console` when application is running.

**API Endpoints:**
- GET `/api/quizzes` - Retrieve all quizzes
- GET `/api/quizzes/{id}` - Retrieve quiz by ID
- POST `/api/quizzes` - Create new quiz
- DELETE `/api/quizzes/{id}` - Delete quiz

## Other Projects

The workspace contains several learning exercises and practice projects in the `projects/` directory:

- `arrays/` - Array manipulation exercises
- `centeralTester/` - Testing scripts
- `labs_Week_2/` - Boolean conditionals and loops lab
- `week3git/` - Git repository practice
- `resumeCode/` - Resume-related code exercises
- `myfirstjavascript/` - Java practice project (despite the name, contains Java files)

These are typically Eclipse projects with standard src/bin structure.

## Git Workflow

**Important:** The git repository is at `eclipse-workspace/` level, not at the Windows user home directory.

**Common git commands (run from eclipse-workspace/):**
```bash
cd eclipse-workspace
git status
git add .
git commit -m "Your message"
```

**What's ignored:**
- Compiled files (*.class, bin/, target/)
- Eclipse metadata (.metadata/)
- Personal config files (.bash_history, .gitconfig)
- Maven build artifacts
- H2 database files

## Important Notes

- **Package naming:** The original package name 'com.studybuddy.quiz-system' was invalid; the project uses 'com.studybuddy.quiz_system' instead (underscore, not hyphen).
- **Working directory:** When running Maven commands, ensure you're in `eclipse-workspace/projects/quiz-system/`.
- **Java version:** Projects require Java 21.
- **Git repository location:** Always work from `eclipse-workspace/` for git operations, not from the Windows user home directory.
- **Project organization:** All projects should be placed in the `projects/` subdirectory to maintain clean organization.

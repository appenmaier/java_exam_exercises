# Java Exam Exercises — Model Solutions

This repository contains model solutions ("Musterlösungen") for all exam exercises from the course [Programmieren mit Java](https://jappuccini.github.io/java-docs/production/).

> **Note:** Exercise names and inline comments are in German; all Javadoc comments are in English.

## Prerequisites

- Java 21
- Maven 3.x

## Build & Test

```bash
# Compile
mvn clean compile

# Run all tests
mvn test

# Run a single test class
mvn test -Dtest=LibraryTest

# Run a single test method
mvn test -Dtest=LibraryTest#testFindBookByIsbn

# Build JAR
mvn clean package
```

## Project Structure

```
src/
├── main/
│   ├── java/
│   │   ├── exams1/
│   │   │   ├── activitydiagrams/   # Implementations from UML activity diagrams
│   │   │   ├── classdiagrams/      # OOP design exercises
│   │   │   └── dicegames/          # Interactive dice game simulations
│   │   └── exams2/
│   │       ├── classdiagrams/      # Advanced OOP exercises with JUnit tests
│   │       └── queries/            # Stream API / collection query exercises
│   └── resources/                  # Data files (.txt, .csv) read by exercises
└── test/
    └── java/
        └── exams2/classdiagrams/   # JUnit 5 test classes (14 total)
```

## Exercise Categories

### Exam 1

| Package | Description |
|---|---|
| `exams1/activitydiagrams/` | Algorithm implementations derived from UML activity diagrams (sorting algorithms, cash machine, discount calculator, timestamp converter) |
| `exams1/classdiagrams/` | 12 OOP design exercises: cards dealer, cashier system, creatures, fast food, gift bag, parking garage, player, santa claus, shape, student course, travel booking, weather station, zoo |
| `exams1/dicegames/` | 16 interactive dice game simulations, each with a `MainClass` entry point, a `Player` class, and game-logic classes |

### Exam 2

| Package | Description |
|---|---|
| `exams2/classdiagrams/` | Advanced OOP exercises with full JUnit 5 test coverage: corner shop, dictionary, fantasy game, human resources, job offer, lego brick, library, player, shopping portal, shop, space station, superleague, team, video collection |
| `exams2/queries/` | Stream API exercises using filtering, sorting, and transforming collections (cities, measurement data, phone store, planets, singles, tanks) |

## Architecture Patterns

Each exercise is self-contained within its own sub-package. Common patterns used across the codebase:

- **Records** — immutable data types (e.g., `Character`, `Planet`, `Book`)
- **Abstract classes with subclasses** — type hierarchies (e.g., `Shape`, `Book`, `Animal`)
- **Enums** — type-safe constants (e.g., `Profession`, `Race`, `Status`)
- **Lombok** — `@Data`, `@Getter`, `@AllArgsConstructor`, etc. on mutable classes
- **Java Streams** — used heavily in `exams2/queries/` exercises
- **`Comparable`** — implemented on records/classes that need natural ordering; a separate `Comparator` class is provided where multiple orderings are needed (e.g., `LegoBrickVolumeComparator`)
- **Reader classes** — parse semicolon-delimited `.txt` files from `src/main/resources/` using `Scanner` with `hasNextLine()` / `nextLine()`

## Dependencies

| Dependency | Version | Scope |
|---|---|---|
| Lombok | 1.18.36 | compile |
| JUnit Jupiter | 5.11.3 | test |
| Mockito | 5.14.2 | test |

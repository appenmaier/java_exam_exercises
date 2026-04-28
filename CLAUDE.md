# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## About This Repository

Model solutions ("Musterlösungen") for Java exam exercises from [Programmieren mit Java](https://jappuccini.github.io/java-docs/production/). Exercise names and comments are in German. All Javadoc comments are in English.

## Build & Test Commands

```bash
# Compile
mvn clean compile

# Run all tests
mvn test

# Run a single test class
mvn test -Dtest=LibraryTest

# Run a single test method
mvn test -Dtest=LibraryTest#testFindBookByIsbn

# Build jar
mvn clean package
```

## Project Structure

- **Java 21**, Maven build, Lombok annotation processing
- `src/main/java/exams1/` — Exam 1 exercises (activity diagrams, class diagrams, dice games)
- `src/main/java/exams2/` — Exam 2 exercises (class diagrams, stream/collection queries)
- `src/main/resources/` — Data files (`.txt`, `.csv`) read by exercises
- `src/test/java/exams2/classdiagrams/` — JUnit 5 tests (14 test classes, primarily for exams2)

### Exercise Categories

| Package | Content |
|---|---|
| `exams1/activitydiagrams/` | Implementations from UML activity diagrams (sorting, calculators) |
| `exams1/classdiagrams/` | 12 OOP design exercises (cards, shapes, zoo, weather station, travel, etc.) |
| `exams1/dicegames/` | 16 interactive dice game simulations |
| `exams2/classdiagrams/` | Advanced OOP exercises (library, fantasy game, HR, shop, superleague, etc.) |
| `exams2/queries/` | Stream API exercises (filtering, sorting, transforming collections) |

## Architecture Patterns

Each exercise is self-contained within its own sub-package. Common patterns across exercises:

- **Records** for immutable data types (e.g., `Character`, `Planet`, `Book`)
- **Abstract classes** with concrete subclasses for type hierarchies (e.g., `Shape`, `Book`)
- **Enums** for type-safe constants (e.g., `Profession`, `Race`, `Status`)
- **Lombok** annotations (`@Data`, `@Getter`, `@AllArgsConstructor`, etc.) on mutable classes
- **Java Streams** used heavily in `exams2/queries/` exercises
- Dice game exercises each follow the same structure: `MainClass` entry point + `Player` + game-logic classes
- `Comparable` is implemented on records and classes that need natural ordering; a separate `Comparator` class is provided where multiple orderings are needed (e.g., `LegoBrickVolumeComparator`)
- Reader classes (e.g., `CardsReader`, `CreaturesReader`, `JobOfferReader`) parse semicolon-delimited `.txt` files from `src/main/resources/` using `Scanner` with `hasNextLine()` / `nextLine()`

## Dependencies

- **Lombok 1.18.36** — annotation processing (compile scope)
- **JUnit Jupiter 5.11.3** — test framework
- **Mockito 5.14.2** — mocking (test scope)

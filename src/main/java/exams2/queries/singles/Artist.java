package exams2.queries.singles;

import java.time.LocalDate;

/**
 * Represents a music artist with their name, country of origin, birthdate, and living status.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record Artist(String name, Country country, LocalDate birthdate, boolean isAlive) {

}

package exams2.queries.singles;

import java.time.LocalDate;

/**
 * Künstler
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record Artist(String name, Country country, LocalDate birthdate, boolean isAlive) {

}

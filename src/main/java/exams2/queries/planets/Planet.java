package exams2.queries.planets;

/**
 * Represents a planet with its physical properties and classification.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record Planet(String name, double diameter, double mass, int moons, Type type) {

}

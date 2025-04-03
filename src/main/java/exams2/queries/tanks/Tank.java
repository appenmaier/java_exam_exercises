package exams2.queries.tanks;

/**
 * Panzer
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record Tank(String name, Type type, Nation nation, int performanceInHorsePower,
      int weightInTons, double lengthInMeters, int maxSpeedInKMH) {

}

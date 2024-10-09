package exams2.queries.planets;

import java.util.ArrayList;
import java.util.List;

/**
 * Planeten
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Planets {

  public static List<Planet> getPlanets() {
    List<Planet> planets = new ArrayList<>();

    planets.add(new Planet("Merkur", 4879, 0.33, 0, Type.TERRESTRIAL_PLANET));
    planets.add(new Planet("Venus", 12104, 4.86, 0, Type.TERRESTRIAL_PLANET));
    planets.add(new Planet("Erde", 12756, 5.97, 1, Type.TERRESTRIAL_PLANET));
    planets.add(new Planet("Mars", 6792, 0.64, 2, Type.TERRESTRIAL_PLANET));
    planets.add(new Planet("Jupiter", 142984, 1898.7, 95, Type.GAS_PLANET));
    planets.add(new Planet("Saturn", 120536, 568.51, 146, Type.GAS_PLANET));
    planets.add(new Planet("Uranus", 51118, 86.849, 27, Type.GAS_PLANET));
    planets.add(new Planet("Neptun", 49528, 102.44, 14, Type.GAS_PLANET));

    return planets;
  }

}

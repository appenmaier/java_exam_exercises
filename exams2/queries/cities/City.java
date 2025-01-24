package exams2.queries.cities;

import java.util.List;

/**
 * Stadt
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record City(String name, double areaInKM2, int inhabitants, GeoLocation geoLocation,
      Major major, List<String> pointsOfInterest) {

}

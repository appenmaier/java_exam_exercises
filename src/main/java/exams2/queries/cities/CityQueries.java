package exams2.queries.cities;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Provides stream-based query operations over a list of cities.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record CityQueries(List<City> cities) {

   /** Returns all majors grouped by their gender. */
   public Map<Gender, List<Major>> getAllMajorsByGender() {
      Map<Gender, List<Major>> majorsByGender =
            cities.stream().map(City::major).collect(Collectors.groupingBy(Major::gender));
      return majorsByGender;
   }

   /** Returns the names of all European cities with more than one million inhabitants. */
   public List<String> getAllNamesFromCitiesInEuropeWithMoreThan1MioInhabitants() {
      List<String> names = cities.stream()
            .filter(c -> c.geoLocation().equals(GeoLocation.EUROPE))
            .filter(c -> c.inhabitants() > 1000000)
            .map(City::name)
            .toList();
      return names;
   }

   /** Returns the name of the mayor of the city with the given name, if found. */
   public Optional<String> getNameOfMajorByNameOfCity(String nameOfCity) {
      Optional<String> majorName = cities.stream()
            .filter(c -> c.name().equals(nameOfCity))
            .map(c -> c.major().name())
            .findAny();
      return majorName;
   }

   /** Returns the combined area in km² of all cities governed by a female mayor. */
   public double getTotalAreaInKm2OfAllCitiesWithFemaleMajors() {
      double totalAreaInKm2 = cities.stream()
            .filter(c -> c.major().gender().equals(Gender.FEMALE))
            .mapToDouble(City::areaInKM2)
            .sum();
      return totalAreaInKm2;
   }

   /** Prints the name and point-of-interest count of the city with the most points of interest. */
   public void printCityWithMostPointsOfInterest() {
      Optional<City> city = cities.stream()
            .max((c1, c2) -> Integer.compare(c1.pointsOfInterest().size(),
                  c2.pointsOfInterest().size()));
      city.ifPresent(t -> System.out.println(t.name() + " (" + t.pointsOfInterest().size() + ")"));
   }

}

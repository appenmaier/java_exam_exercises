package exams2.queries.cities;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * CityQueries
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record CityQueries(List<City> cities) {

  public Map<Gender, List<Major>> getAllMajorsByGender() {
    Map<Gender, List<Major>> majorsByGender =
        cities.stream().map(City::major).collect(Collectors.groupingBy(Major::gender));
    return majorsByGender;
  }

  public List<String> getAllNamesFromCitiesInEuropeWithMoreThan1MioInhabitants() {
    List<String> names = cities.stream()
        .filter(c -> c.geoLocation().equals(GeoLocation.EUROPE))
        .filter(c -> c.inhabitants() > 1000000)
        .map(City::name)
        .toList();
    return names;
  }

  public Optional<String> getNameOfMajorByNameOfCity(String nameOfCity) {
    Optional<String> majorName = cities.stream()
        .filter(c -> c.name().equals(nameOfCity))
        .map(c -> c.major().name())
        .findAny();
    return majorName;
  }

  public double getTotalAreaInKm2OfAllCitiesWithFemaleMajors() {
    double totalAreaInKm2 = cities.stream()
        .filter(c -> c.major().gender().equals(Gender.FEMALE))
        .mapToDouble(City::areaInKM2)
        .sum();
    return totalAreaInKm2;
  }

  public void printCityWithMostPointsOfInterest() {
    Optional<City> city = cities.stream()
        .max((c1, c2) -> Integer.compare(c1.pointsOfInterest().size(),
            c2.pointsOfInterest().size()));
    city.ifPresent(t -> System.out.println(t.name() + " (" + t.pointsOfInterest().size() + ")"));
  }

}

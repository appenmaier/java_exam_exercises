package exams2.queries.cities;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * MainClass
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class MainClass {

  public static void main(String[] args) {
    CityQueries queries = new CityQueries(new ArrayList<>());
    queries.cities()
        .add(new City("Stadt A", 599, 2976243, GeoLocation.EUROPE,
            new Major("Buergermeister A", Gender.MALE), Arrays.asList("POI 1", "POI 2", "POI 3")));
    queries.cities()
        .add(new City("Stadt B", 745, 4230822, GeoLocation.AFRICA,
            new Major("Buergermeister B", Gender.INTERSEX), Arrays.asList("POI 1", "POI 2")));
    queries.cities()
        .add(new City("Stadt C", 134, 430219, GeoLocation.EUROPE,
            new Major("Buergermeister C", Gender.FEMALE), Arrays.asList("POI 1")));
    queries.cities()
        .add(new City("Stadt D", 657, 1198230, GeoLocation.ASIA,
            new Major("Buergermeister D", Gender.FEMALE),
            Arrays.asList("POI 1", "POI 2", "POI 3", "POI 4")));
    queries.cities()
        .add(new City("Stadt E", 280, 789344, GeoLocation.NORTH_AMERICA,
            new Major("Buergermeister E", Gender.MALE), Arrays.asList("POI 1", "POI 2", "POI 3")));
    queries.cities()
        .add(new City("Stadt F", 912, 6982718, GeoLocation.EUROPE,
            new Major("Buergermeister F", Gender.FEMALE),
            Arrays.asList("POI 1", "POI 2", "POI 3", "POI 4")));

    queries.getAllMajorsByGender().forEach((g, ms) -> System.out.println(g + ": " + ms));
    System.out.println();
    queries.getAllNamesFromCitiesInEuropeWithMoreThan1MioInhabitants().forEach(System.out::println);
    System.out.println();
    queries.getNameOfMajorByNameOfCity("Stadt D").ifPresent(System.out::println);
    System.out.println();
    System.out.println(queries.getTotalAreaInKm2OfAllCitiesWithFemaleMajors());
    System.out.println();
    queries.printCityWithMostPointsOfInterest();

  }

}

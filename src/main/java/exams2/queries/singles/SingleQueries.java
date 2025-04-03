package exams2.queries.singles;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

/**
 * SingleQueries
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record SingleQueries(List<Single> singles) {

   public void printAllSinglesWithMoreThan25MillionSalesPerCountry() {
      Map<Country, List<Single>> allSinglesWithMoreThan25MillionSalesPerCountry;
      allSinglesWithMoreThan25MillionSalesPerCountry = singles.stream()
            .filter(s -> s.salesInMillions() > 25)
            .collect(Collectors.groupingBy(s -> s.artist().country()));
      allSinglesWithMoreThan25MillionSalesPerCountry
            .forEach((c, sl) -> System.out.println(c + ": " + sl));
   }

   public void printAverageBirthYearOfAllDeceasedArtists() {
      OptionalDouble averageBirthYearOfAllDeceasedArtists;
      averageBirthYearOfAllDeceasedArtists = singles.stream()
            .map(Single::artist)
            .distinct()
            .filter(a -> !a.isAlive())
            .mapToInt(a -> a.birthdate().getYear())
            .average();
      averageBirthYearOfAllDeceasedArtists.ifPresentOrElse(System.out::println,
            () -> System.out.println(-1));
   }

   public boolean isAnySingleFromChinaWithMoreThan10MillionSales() {
      boolean isAnySingleFromChinaWithMoreThan10MillionSales;
      isAnySingleFromChinaWithMoreThan10MillionSales = singles.stream()
            .filter(s -> s.salesInMillions() > 10)
            .anyMatch(s -> s.artist().country().equals(Country.CHN));
      return isAnySingleFromChinaWithMoreThan10MillionSales;
   }

   public List<Single> getAllSinglesFromEdSheeran() {
      List<Single> allSinglesFromEdSheeran;
      Artist sheeran = new Artist("Ed Sheeran", Country.GBR, LocalDate.of(1991, 2, 17), true);
      allSinglesFromEdSheeran = singles.stream().filter(s -> s.artist().equals(sheeran)).toList();
      return allSinglesFromEdSheeran;
   }

}

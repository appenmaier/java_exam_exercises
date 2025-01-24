package exams2.queries.measurementdata;

import java.time.LocalDate;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

/**
 * MainClass
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class MainClass {

   public static void main(String[] args) {

      System.out.println("Alle Messdaten");
      MeasurementData.getData().forEach(System.out::println);
      System.out.println();

      System.out.println(
            "Alle Messdaten aus dem Jahr 2020 der Kategorie F absteigend sortiert nach dem Prozentsatz");
      MeasurementData.getData()
            .stream()
            .filter(m -> m.date().getYear() == 2020)
            .filter(m -> m.category() == 'F')
            .sorted((m1, m2) -> Integer.valueOf(m2.percentage()).compareTo(m1.percentage()))
            .forEach(System.out::println);
      System.out.println();

      System.out.println("Der Durchschnitts-Prozentsatz aller Messdaten der Kategorie X");
      OptionalDouble averagePercentage = MeasurementData.getData()
            .stream()
            .filter(m -> m.category() == 'X')
            .mapToInt(m -> m.percentage())
            .average();
      System.out.println(averagePercentage);
      System.out.println();

      System.out.println(
            "Alle Messdaten, bei denen die Temperatur im Sommer (Juni - August) bei mindestens 30° lag");
      MeasurementData.getData()
            .stream()
            .filter(m -> m.date().getMonthValue() == 6 || m.date().getMonthValue() == 7
                  || m.date().getMonthValue() == 8)
            .filter(m -> m.temperature() >= 30)
            .forEach(System.out::println);
      System.out.println();

      System.out.println(
            "Die Antwort auf die Frage, ob es einen Messdatensatz aus Deutschland, datiert nach dem 01.01.2021, mit einem Prozentsatz von mindestens 50% gibt");
      LocalDate firstOfJanuary21 = LocalDate.of(2021, 1, 1);
      boolean dataExists = MeasurementData.getData()
            .stream()
            .anyMatch(m -> m.country().equals("Deutschland")
                  && m.date().compareTo(firstOfJanuary21) >= 0 && m.percentage() > 50);
      System.out.println(dataExists);
      System.out.println();

      System.out.println("Die durchschnittliche Temperatur gruppiert nach Laendern");
      MeasurementData.getData()
            .stream()
            .collect(Collectors.groupingBy(m -> m.country()))
            .forEach((c, m) -> System.out
                  .println(c + ": " + m.stream().mapToDouble(x -> x.temperature()).average()));
      System.out.println();

      System.out.println(
            "Die Anzahl aller Messdaten gruppiert nach den Prozentsatzbereichen (0-10, 10-20,…)");
      MeasurementData.getData()
            .stream()
            .map(m -> m.percentage() > 89 ? "90-100"
                  : m.percentage() > 79 ? "80-90"
                        : m.percentage() > 69 ? "70-80"
                              : m.percentage() > 59 ? "50-60"
                                    : m.percentage() > 49 ? "40-50"
                                          : m.percentage() > 39 ? "30-40"
                                                : m.percentage() > 29 ? "20-30"
                                                      : m.percentage() > 19 ? "10-20" : "0-10")
            .collect(Collectors.groupingBy(p -> p))
            .forEach((p, e) -> System.out.println(p + ": " + e.size()));

   }

}

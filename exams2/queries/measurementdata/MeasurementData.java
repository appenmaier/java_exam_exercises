package exams2.queries.measurementdata;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Datensatz
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record MeasurementData(String country, LocalDate date, double temperature, int percentage,
    char category) {

  private final static int NUMBER_OF_ENTRIES = 100;
  private final static int MAX_DAYS = 2000;
  private final static int MAX_TEMPERATURE = 40;
  private final static int MAX_PERCENTAGE = 101;
  private final static List<String> COUNTRIES =
      List.of("USA", "Brasilien", "Deutschland", "Japan", "Indien");
  private final static List<Character> CATEGORIES = List.of('D', 'X', 'F');

  public static ArrayList<MeasurementData> getData() {
    ArrayList<MeasurementData> measurementData = new ArrayList<>();

    Random rd = new Random();
    LocalDate ld = LocalDate.now();

    for (int i = 0; i < NUMBER_OF_ENTRIES; i++) {
      LocalDate date = ld.minusDays(rd.nextInt(MAX_DAYS));
      double temperature = rd.nextDouble(MAX_TEMPERATURE);
      int percentage = rd.nextInt(MAX_PERCENTAGE);
      String country = COUNTRIES.get(rd.nextInt(COUNTRIES.size()));
      char category = CATEGORIES.get(rd.nextInt(CATEGORIES.size()));
      measurementData.add(new MeasurementData(country, date, temperature, percentage, category));
    }

    return measurementData;
  }

}


package exams1.classdiagrams.travel;

import java.time.LocalDate;

/**
 * MainClass
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class MainClass {

   public static void main(String[] args) {
      Travel travel =
            new Travel("New York 2025", LocalDate.of(2025, 2, 28), LocalDate.of(2025, 3, 2));

      Flight flight1 = new Flight("LH 0400", LocalDate.of(2025, 2, 28), 499.99);
      Flight flight2 = new Flight("LH 0401", LocalDate.of(2025, 3, 2), 750);
      Accommodation accommodation = new Accommodation("Four Seasons", "New York", 2678.50);

      travel.addBooking(flight1);
      travel.addBooking(flight2);
      travel.addBooking(accommodation);

      System.out.println(travel);
      System.out.println("Reisekosten in Euro: " + travel.getTotalTravelCostsInEuro());
      System.out.println("Fluege: " + travel.getFlights());
   }

}

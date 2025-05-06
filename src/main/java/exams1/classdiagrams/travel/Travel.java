package exams1.classdiagrams.travel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Reise
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Travel {

   private final String description;
   private final LocalDate start;
   private final LocalDate end;
   private final List<Booking> bookings;

   public Travel(String description, LocalDate start, LocalDate end) {
      this.description = description;
      this.start = start;
      this.end = end;
      bookings = new ArrayList<>();
   }

   public void addBooking(Booking booking) {
      bookings.add(booking);
   }

   public double getTotalTravelCostsInEuro() {
      double totalTravelCosts = 0;
      for (Booking b : bookings) {
         totalTravelCosts += b.getPriceInEuro();
      }
      return totalTravelCosts;
   }

   public List<Flight> getFlights() {
      List<Flight> flights = new ArrayList<>();
      for (Booking b : bookings) {
         if (b instanceof Flight f) {
            flights.add(f);
         }
      }
      return flights;
   }

   @Override
   public int hashCode() {
      return Objects.hash(bookings, description, end, start);
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }
      if (obj == null) {
         return false;
      }
      if (getClass() != obj.getClass()) {
         return false;
      }
      Travel other = (Travel) obj;
      return Objects.equals(bookings, other.bookings)
            && Objects.equals(description, other.description) && Objects.equals(end, other.end)
            && Objects.equals(start, other.start);
   }

   @Override
   public String toString() {
      return "Travel [description=" + description + ", start=" + start + ", end=" + end
            + ", bookings=" + bookings + "]";
   }

}

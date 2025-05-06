package exams1.classdiagrams.travel;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Flug
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Flight extends AbstractBooking {

   private final String flightId;
   private final LocalDate flightDate;

   public Flight(String flightId, LocalDate flightDate, double priceInEuro) {
      super(priceInEuro);
      this.flightId = flightId;
      this.flightDate = flightDate;
   }

   public String getFlightId() {
      return flightId;
   }

   public LocalDate getFlightDate() {
      return flightDate;
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = super.hashCode();
      result = prime * result + Objects.hash(flightDate, flightId);
      return result;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }
      if (!super.equals(obj)) {
         return false;
      }
      if (getClass() != obj.getClass()) {
         return false;
      }
      Flight other = (Flight) obj;
      return Objects.equals(flightDate, other.flightDate)
            && Objects.equals(flightId, other.flightId);
   }

   @Override
   public String toString() {
      return "Flight [flightId=" + flightId + ", flightDate=" + flightDate + "]";
   }

}

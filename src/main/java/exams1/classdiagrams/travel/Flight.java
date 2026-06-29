package exams1.classdiagrams.travel;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Represents a flight booking identified by a flight ID and flight date.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Flight extends AbstractBooking {

   private final String flightId;
   private final LocalDate flightDate;

   /**
    * Creates a new flight booking with the given flight ID, flight date, and price.
    *
    * @param flightId    the unique identifier of the flight
    * @param flightDate  the date of the flight
    * @param priceInEuro the price of the flight in euros
    */
   public Flight(String flightId, LocalDate flightDate, double priceInEuro) {
      super(priceInEuro);
      this.flightId = flightId;
      this.flightDate = flightDate;
   }

   /** Returns the unique identifier of this flight. */
   public String getFlightId() {
      return flightId;
   }

   /** Returns the date of this flight. */
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

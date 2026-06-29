package exams1.classdiagrams.travel;

import java.time.LocalDate;

/**
 * Represents a bookable item that has a price and a booking date.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public interface Booking {

   /** Returns the price of this booking in euros. */
   double getPriceInEuro();

   /** Returns the date on which this booking was created. */
   LocalDate getBookingDate();

}

package exams1.classdiagrams.travel;

import java.time.LocalDate;

/**
 * Buchung
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public interface Booking {

   double getPriceInEuro();

   LocalDate getBookingDate();

}

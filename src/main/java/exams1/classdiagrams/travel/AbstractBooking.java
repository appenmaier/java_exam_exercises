package exams1.classdiagrams.travel;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Abstract base class for bookings that stores price and booking date.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public abstract class AbstractBooking implements Booking {

   private final double priceInEuro;
   private final LocalDate bookingDate;

   /**
    * Creates a new abstract booking with the given price; records today as the booking date.
    *
    * @param priceInEuro the price of the booking in euros
    */
   public AbstractBooking(double priceInEuro) {
      this.priceInEuro = priceInEuro;
      bookingDate = LocalDate.now();
   }

   /** Returns the price of this booking in euros. */
   @Override
   public final double getPriceInEuro() {
      return priceInEuro;
   }

   /** Returns the date on which this booking was created. */
   @Override
   public final LocalDate getBookingDate() {
      return bookingDate;
   }

   @Override
   public int hashCode() {
      return Objects.hash(bookingDate, priceInEuro);
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
      AbstractBooking other = (AbstractBooking) obj;
      return Objects.equals(bookingDate, other.bookingDate)
            && Double.doubleToLongBits(priceInEuro) == Double.doubleToLongBits(other.priceInEuro);
   }

   @Override
   public String toString() {
      return "AbstractBooking [priceInEuro=" + priceInEuro + ", bookingDate=" + bookingDate + "]";
   }

}

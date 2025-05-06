package exams1.classdiagrams.travel;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Buchung
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public abstract class AbstractBooking implements Booking {

   private final double priceInEuro;
   private final LocalDate bookingDate;

   public AbstractBooking(double priceInEuro) {
      this.priceInEuro = priceInEuro;
      bookingDate = LocalDate.now();
   }

   @Override
   public final double getPriceInEuro() {
      return priceInEuro;
   }

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

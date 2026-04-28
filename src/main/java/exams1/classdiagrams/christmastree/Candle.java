package exams1.classdiagrams.christmastree;

import java.util.Objects;

/**
 * Represents a candle with a colour that can be lit or extinguished.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Candle {

   private final String colour;
   protected boolean isBurning;

   public Candle(String colour) {
      this.colour = colour;
   }

   /** Returns the colour of this candle. */
   public String colour() {
      return colour;
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
      Candle other = (Candle) obj;
      return Objects.equals(colour, other.colour) && isBurning == other.isBurning;
   }

   @Override
   public int hashCode() {
      return Objects.hash(colour, isBurning);
   }

   /** Returns whether this candle is currently burning. */
   public boolean isBurning() {
      return isBurning;
   }

   /** Lights this candle so that it is burning. */
   public void lightACandle() {
      isBurning = true;
   }

   @Override
   public String toString() {
      return "Candle [colour=" + colour + ", isBurning=" + isBurning + "]";
   }

   /** Extinguishes this candle so that it is no longer burning. */
   public void turnOffACandle() {
      isBurning = false;
   }

}

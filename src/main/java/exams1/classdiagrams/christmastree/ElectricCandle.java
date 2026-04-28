package exams1.classdiagrams.christmastree;

import java.util.Objects;

/**
 * Represents a battery-powered electric candle that consumes power each time it is lit.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class ElectricCandle extends Candle {

   private int power;

   public ElectricCandle(String colour) {
      super(colour);
      power = 100;
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
      ElectricCandle other = (ElectricCandle) obj;
      return power == other.power;
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = super.hashCode();
      result = prime * result + Objects.hash(power);
      return result;
   }

   /** Lights this electric candle if it has remaining power, consuming 10 units of charge. */
   @Override
   public void lightACandle() {
      if (power > 0) {
         power -= 10;
         isBurning = true;
      }
   }

   /** Recharges this electric candle to full power. */
   public void recharge() {
      power = 100;
   }

   @Override
   public String toString() {
      return "ElectricCandle [power=" + power + ", isBurning=" + isBurning + ", colour()="
            + colour() + "]";
   }

}

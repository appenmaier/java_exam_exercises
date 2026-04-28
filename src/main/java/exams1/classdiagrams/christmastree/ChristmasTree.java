package exams1.classdiagrams.christmastree;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents a Christmas tree that holds a collection of candles and can be illuminated.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class ChristmasTree {

   private final List<Candle> candles;
   private final double size;
   private final String type;

   public ChristmasTree(String type, double size) {
      this.type = type;
      this.size = size;
      candles = new ArrayList<>();
   }

   /** Adds a candle to this Christmas tree. */
   public void addCandle(Candle candle) {
      candles.add(candle);
   }

   /** Returns the list of all candles on this Christmas tree. */
   public List<Candle> candles() {
      return candles;
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
      ChristmasTree other = (ChristmasTree) obj;
      return Objects.equals(candles, other.candles)
            && Double.doubleToLongBits(size) == Double.doubleToLongBits(other.size)
            && Objects.equals(type, other.type);
   }

   /** Returns the number of electric candles on this Christmas tree. */
   public int getNumberOfElectricCandles() {
      int numberOfElectricCandles = 0;

      for (Candle c : candles) {
         if (c instanceof ElectricCandle) {
            numberOfElectricCandles++;
         }
      }

      return numberOfElectricCandles;
   }

   @Override
   public int hashCode() {
      return Objects.hash(candles, size, type);
   }

   /** Lights all candles on this Christmas tree. */
   public void lightChristmasTree() {
      for (Candle c : candles) {
         c.lightACandle();
      }
   }

   /** Returns the height of this Christmas tree in metres. */
   public double size() {
      return size;
   }

   @Override
   public String toString() {
      return "ChristmasTree [candles=" + candles + ", size=" + size + ", type=" + type + "]";
   }

   /** Returns the species or type of this Christmas tree. */
   public String type() {
      return type;
   }

}

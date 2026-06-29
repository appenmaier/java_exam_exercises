package exams1.classdiagrams.easterbasket;

import java.util.Objects;

/**
 * Abstract base class representing an egg in an easter basket.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public abstract class Egg {

   private final String color;

   /**
    * Creates an egg with the given color.
    *
    * @param color the color of the egg
    */
   public Egg(String color) {
      this.color = color;
   }

   /**
    * Returns the weight of the egg in grams.
    *
    * @return weight in grams
    */
   public abstract double getWeightInG();

   /**
    * Returns the color of the egg.
    *
    * @return the color
    */
   public String getColor() {
      return color;
   }

   @Override
   public int hashCode() {
      return Objects.hash(color);
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
      Egg other = (Egg) obj;
      return Objects.equals(color, other.color);
   }

   @Override
   public String toString() {
      return "Egg [color=" + color + "]";
   }

}

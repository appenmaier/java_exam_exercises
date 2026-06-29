package exams1.classdiagrams.easterbasket;

import java.util.Objects;

/**
 * A real chicken egg with a fixed weight.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
class ChickenEgg extends Egg {

   private final double weightInG;

   /**
    * Creates a chicken egg with the given color and weight.
    *
    * @param color     the color of the egg
    * @param weightInG the weight in grams
    */
   public ChickenEgg(String color, double weightInG) {
      super(color);
      this.weightInG = weightInG;
   }

   /**
    * Returns the weight of this chicken egg in grams.
    *
    * @return weight in grams
    */
   @Override
   public double getWeightInG() {
      return weightInG;
   }

   @Override
   public int hashCode() {
      return Objects.hash(weightInG);
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
      ChickenEgg other = (ChickenEgg) obj;
      return Double.doubleToLongBits(weightInG) == Double.doubleToLongBits(other.weightInG);
   }

   @Override
   public String toString() {
      return "ChickenEgg [weightInG=" + weightInG + "]";
   }

}

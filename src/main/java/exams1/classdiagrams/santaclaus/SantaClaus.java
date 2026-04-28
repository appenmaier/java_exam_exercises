package exams1.classdiagrams.santaclaus;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents Santa Claus who manages a collection of presents to be wrapped and delivered.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class SantaClaus {

   private final List<Present> presents;

   public SantaClaus() {
      this.presents = new ArrayList<>();
   }

   /** Adds a present to Santa's collection. */
   public void addPresent(Present present) {
      presents.add(present);
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
      SantaClaus other = (SantaClaus) obj;
      return Objects.equals(presents, other.presents);
   }

   /** Returns the total number of toys in Santa's present collection. */
   public int getNumberOfToys() {
      int total = 0;
      for (Present p : presents) {
         if (p instanceof Toy) {
            total++;
         }
      }
      return total;
   }

   @Override
   public int hashCode() {
      return Objects.hash(presents);
   }

   @Override
   public String toString() {
      return "SantaClaus [presents=" + presents + "]";
   }

   /** Wraps all presents in Santa's collection. */
   public void wrapAllPresents() {
      for (Present p : presents) {
         p.wrap();
      }
   }

}

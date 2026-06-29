package exams1.classdiagrams.easterbasket;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A basket that holds a collection of eggs.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
class EasterBasket {

   private final List<Egg> eggs;

   /**
    * Creates an empty easter basket.
    */
   public EasterBasket() {
      eggs = new ArrayList<>();
   }

   /**
    * Adds an egg to the basket.
    *
    * @param egg the egg to add
    */
   public void addEgg(Egg egg) {
      eggs.add(egg);
   }

   /**
    * Returns all confectionery eggs in the basket.
    *
    * @return list of confectionery eggs
    */
   public List<ConfectioneryEgg> getConfectioneryEggs() {
      List<ConfectioneryEgg> result = new ArrayList<>();
      for (Egg e : eggs) {
         if (e instanceof ConfectioneryEgg) {
            ConfectioneryEgg c = (ConfectioneryEgg) e;
            result.add(c);
         }
      }
      return result;
   }

   /**
    * Returns the total weight of all eggs in grams.
    *
    * @return total weight in grams
    */
   public double getTotalWeightInG() {
      double total = 0;
      for (Egg e : eggs) {
         total += e.getWeightInG();
      }
      return total;
   }

   /**
    * Returns all eggs in the basket.
    *
    * @return list of all eggs
    */
   public List<Egg> getEggs() {
      return eggs;
   }

   @Override
   public int hashCode() {
      return Objects.hash(eggs);
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
      EasterBasket other = (EasterBasket) obj;
      return Objects.equals(eggs, other.eggs);
   }

   @Override
   public String toString() {
      return "EasterBasket [eggs=" + eggs + "]";
   }

}

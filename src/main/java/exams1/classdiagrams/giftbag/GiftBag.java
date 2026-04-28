package exams1.classdiagrams.giftbag;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents a gift bag that holds a collection of presents.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class GiftBag {

   private final List<Present> presents;

   public GiftBag() {
      this.presents = new ArrayList<>();
   }

   /** Adds a present to this gift bag. */
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
      GiftBag other = (GiftBag) obj;
      return Objects.equals(presents, other.presents);
   }

   /** Returns the most expensive present in this gift bag. */
   public Present getMostExpensivePresent() {
      Present mostExpensivePresent = presents.get(0);
      double highestPrice = mostExpensivePresent.price();
      for (int i = 0; i < presents.size(); i++) {
         Present present = presents.get(i);
         if (present.price() > highestPrice) {
            mostExpensivePresent = present;
            highestPrice = present.price();
         }
      }
      return mostExpensivePresent;
   }

   @Override
   public int hashCode() {
      return Objects.hash(presents);
   }

   /** Returns the list of all presents in this gift bag. */
   public List<Present> presents() {
      return presents;
   }

   @Override
   public String toString() {
      return "GiftBag [presents=" + presents + "]";
   }

}

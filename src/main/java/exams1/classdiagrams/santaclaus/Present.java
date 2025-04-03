package exams1.classdiagrams.santaclaus;

import java.util.Objects;

/**
 * Geschenk
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public abstract class Present implements Wrappable {

   private boolean isWrapped;

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
      Present other = (Present) obj;
      return isWrapped == other.isWrapped;
   }

   @Override
   public int hashCode() {
      return Objects.hash(isWrapped);
   }

   public boolean isWrapped() {
      return isWrapped;
   }

   @Override
   public String toString() {
      return "Present [isWrapped=" + isWrapped + "]";
   }

   @Override
   public void unwrap() {
      isWrapped = false;
   }

   @Override
   public void wrap() {
      isWrapped = true;
   }

}

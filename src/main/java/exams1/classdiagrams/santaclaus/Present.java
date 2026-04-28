package exams1.classdiagrams.santaclaus;

import java.util.Objects;

/**
 * Represents an abstract present that can be wrapped or unwrapped.
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

   /** Returns whether this present is currently wrapped. */
   public boolean isWrapped() {
      return isWrapped;
   }

   @Override
   public String toString() {
      return "Present [isWrapped=" + isWrapped + "]";
   }

   /** Unwraps this present by setting its wrapped state to false. */
   @Override
   public void unwrap() {
      isWrapped = false;
   }

   /** Wraps this present by setting its wrapped state to true. */
   @Override
   public void wrap() {
      isWrapped = true;
   }

}

package exams2.classdiagrams.legobrick;

import java.util.Arrays;

/**
 * Lego-Baustein 2x2x2
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public final class LegoBrick2x2x2 extends LegoBrick {

   public LegoBrick2x2x2(int id, String color) {
      super(id, new int[] {2, 2, 2}, color);
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
      return true;
   }

   @Override
   public int hashCode() {
      return super.hashCode();
   }

   @Override
   public String toString() {
      return "LegoBrick2x2x2 [color()=" + color() + ", getDimensions()="
            + Arrays.toString(getDimensions()) + ", id()=" + id() + "]";
   }

}

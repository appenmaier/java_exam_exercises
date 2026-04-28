package exams2.classdiagrams.legobrick;

import java.util.Arrays;
import java.util.Objects;

/**
 * Abstract base class representing a Lego brick with dimensions and a color.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public abstract class LegoBrick extends Lego {

   private final String color;
   private final int[] dimensions;

   public LegoBrick(int id, int[] dimensions, String color) {
      super(id);
      this.dimensions = dimensions;
      this.color = color;
   }

   /**
    * Returns the color of this Lego brick.
    */
   public String color() {
      return color;
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
      LegoBrick other = (LegoBrick) obj;
      return Objects.equals(color, other.color) && Arrays.equals(dimensions, other.dimensions);
   }

   /**
    * Returns the dimensions array of this Lego brick.
    */
   public int[] getDimensions() {
      return dimensions;
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = super.hashCode();
      result = prime * result + Arrays.hashCode(dimensions);
      result = prime * result + Objects.hash(color);
      return result;
   }

   @Override
   public String toString() {
      return "LegoBrick [dimensions=" + Arrays.toString(dimensions) + ", color=" + color + ", id()="
            + id() + "]";
   }

}

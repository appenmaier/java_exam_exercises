package exams1.classdiagrams.studentcourse;

import java.util.Objects;

/**
 * Represents a lecture with a code, description, and credit points.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Lecture {

   private final String code;
   private final int creditPoints;
   private final String description;

   public Lecture(String code, String description, int creditPoints) {
      this.code = code;
      this.description = description;
      this.creditPoints = creditPoints;
   }

   /** Returns the unique code of this lecture. */
   public String code() {
      return code;
   }

   /** Returns the number of credit points awarded for this lecture. */
   public int creditPoints() {
      return creditPoints;
   }

   /** Returns the description of this lecture. */
   public String description() {
      return description;
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
      Lecture other = (Lecture) obj;
      return Objects.equals(code, other.code) && creditPoints == other.creditPoints
            && Objects.equals(description, other.description);
   }

   @Override
   public int hashCode() {
      return Objects.hash(code, creditPoints, description);
   }

   @Override
   public String toString() {
      return "Lecture [code=" + code + ", creditPoints=" + creditPoints + ", description="
            + description + "]";
   }

}

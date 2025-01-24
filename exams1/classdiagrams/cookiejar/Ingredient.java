package exams1.classdiagrams.cookiejar;

import java.util.Objects;

/**
 * Zutat
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Ingredient {

   private final String name;

   public Ingredient(String name) {
      this.name = name;
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
      Ingredient other = (Ingredient) obj;
      return Objects.equals(name, other.name);
   }

   @Override
   public int hashCode() {
      return Objects.hash(name);
   }

   public String name() {
      return name;
   }

   @Override
   public String toString() {
      return "Ingredient [name=" + name + "]";
   }

}

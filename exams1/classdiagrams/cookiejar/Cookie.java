package exams1.classdiagrams.cookiejar;

import java.util.List;
import java.util.Objects;

/**
 * Plaetzchen
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Cookie {

   private final Recipe dough;
   private final String name;

   public Cookie(String name, Recipe dough) {
      this.name = name;
      this.dough = dough;
   }

   public Recipe dough() {
      return dough;
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
      Cookie other = (Cookie) obj;
      return Objects.equals(dough, other.dough) && Objects.equals(name, other.name);
   }

   public List<Ingredient> getIngredients() {
      return dough.ingredients();
   }

   @Override
   public int hashCode() {
      return Objects.hash(dough, name);
   }

   public String name() {
      return name;
   }

   @Override
   public String toString() {
      return "Cookie [dough=" + dough + ", name=" + name + "]";
   }

}

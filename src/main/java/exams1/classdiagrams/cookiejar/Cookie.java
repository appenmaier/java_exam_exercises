package exams1.classdiagrams.cookiejar;

import java.util.List;
import java.util.Objects;

/**
 * Represents a cookie with a name and a dough recipe.
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

   /** Returns the dough recipe used to make this cookie. */
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

   /** Returns the combined list of ingredients from the dough recipe. */
   public List<Ingredient> getIngredients() {
      return dough.ingredients();
   }

   @Override
   public int hashCode() {
      return Objects.hash(dough, name);
   }

   /** Returns the name of this cookie. */
   public String name() {
      return name;
   }

   @Override
   public String toString() {
      return "Cookie [dough=" + dough + ", name=" + name + "]";
   }

}

package exams1.classdiagrams.cookiejar;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents a baking recipe with a name and a list of ingredients.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Recipe {

   private final List<Ingredient> ingredients;
   private final String name;

   public Recipe(String name) {
      this.name = name;
      ingredients = new ArrayList<>();
   }

   /** Adds an ingredient to this recipe. */
   public void addIngredient(Ingredient ingredient) {
      ingredients.add(ingredient);
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
      Recipe other = (Recipe) obj;
      return Objects.equals(ingredients, other.ingredients) && Objects.equals(name, other.name);
   }

   @Override
   public int hashCode() {
      return Objects.hash(ingredients, name);
   }

   /** Returns the list of ingredients in this recipe. */
   public List<Ingredient> ingredients() {
      return ingredients;
   }

   /** Returns the name of this recipe. */
   public String name() {
      return name;
   }

   @Override
   public String toString() {
      return "Recipe [ingredients=" + ingredients + ", name=" + name + "]";
   }

}

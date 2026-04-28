package exams1.classdiagrams.fastfood;

import java.util.Objects;

/**
 * Represents a food item with a name, category, and calorie count.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Food {

   private final double calories;
   private final FoodCategory foodCategory;
   private final String name;

   public Food(String name, FoodCategory foodCategory, double calories) {
      this.name = name;
      this.foodCategory = foodCategory;
      this.calories = calories;
   }

   /** Returns the calorie count of this food item. */
   public double calories() {
      return calories;
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
      Food other = (Food) obj;
      return Double.doubleToLongBits(calories) == Double.doubleToLongBits(other.calories)
            && Objects.equals(name, other.name) && foodCategory == other.foodCategory;
   }

   /** Returns the food category of this food item. */
   public FoodCategory foodCategory() {
      return foodCategory;
   }

   @Override
   public int hashCode() {
      return Objects.hash(calories, name, foodCategory);
   }

   /** Returns the name of this food item. */
   public String name() {
      return name;
   }

   @Override
   public String toString() {
      return "Food [calories=" + calories + ", name=" + name + ", foodCategory=" + foodCategory
            + "]";
   }

}

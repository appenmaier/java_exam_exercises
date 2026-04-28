package exams2.classdiagrams.shop;

/**
 * Represents a fast-food item with a category, caloric value, and vegetarian flag.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record FastFood(String name, FastFoodCategory fastFoodCategory, double calorificValueInKcal,
      boolean isVegetarian) implements Comparable<FastFood> {

   /** Compares fast-food items by caloric value descending. */
   @Override
   public int compareTo(FastFood otherFastFood) {
      return Double.compare(otherFastFood.calorificValueInKcal, calorificValueInKcal);
   }

}

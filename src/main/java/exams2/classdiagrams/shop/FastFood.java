package exams2.classdiagrams.shop;

/**
 * Fast-Food
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record FastFood(String name, FastFoodCategory fastFoodCategory, double calorificValueInKcal,
      boolean isVegetarian) implements Comparable<FastFood> {

   @Override
   public int compareTo(FastFood otherFastFood) {
      return Double.compare(otherFastFood.calorificValueInKcal, calorificValueInKcal);
   }

}

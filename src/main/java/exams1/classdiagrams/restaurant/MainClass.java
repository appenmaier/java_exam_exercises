package exams1.classdiagrams.restaurant;

import java.util.List;

/**
 * Entry point for the restaurant exercise.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class MainClass {

   /**
    * Demonstrates creating a restaurant menu and querying dishes by type and protein content.
    *
    * @param args command-line arguments (not used)
    */
   public static void main(String[] args) {
      Restaurant restaurant = new Restaurant("Gourmet Tempel");

      Dish mousse = new Dish("Schokomousse", DishType.DESSERT, new NutritionValues(40, 25, 5));
      mousse.setPriceInEuro(6.50);

      Dish steak = new Dish("Rindersteak", DishType.MAIN_COURSE, new NutritionValues(0, 15, 60));
      steak.setPriceInEuro(24.90);

      Dish pasta =
            new Dish("Pasta Carbonara", DishType.MAIN_COURSE, new NutritionValues(70, 30, 15));
      pasta.setPriceInEuro(12.00);

      restaurant.addDish(mousse);
      restaurant.addDish(steak);
      restaurant.addDish(pasta);

      List<Dish> desserts = restaurant.getDishesByType(DishType.DESSERT);
      System.out.println(desserts);

      List<Dish> highProteinDishes = restaurant.getHighProteinDishes(50.0);
      System.out.println(highProteinDishes);
   }

}

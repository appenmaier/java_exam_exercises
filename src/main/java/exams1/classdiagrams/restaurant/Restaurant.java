package exams1.classdiagrams.restaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A restaurant with a menu of dishes.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
class Restaurant {

   private final String name;
   private final List<Dish> menu;

   /**
    * Creates a restaurant with the given name and an empty menu.
    *
    * @param name the name of the restaurant
    */
   public Restaurant(String name) {
      this.name = name;
      this.menu = new ArrayList<>();
   }

   /**
    * Adds a dish to the menu.
    *
    * @param dish the dish to add
    */
   public void addDish(Dish dish) {
      menu.add(dish);
   }

   /**
    * Returns all dishes of the given type.
    *
    * @param type the dish type to filter by
    * @return list of matching dishes
    */
   public List<Dish> getDishesByType(DishType type) {
      List<Dish> result = new ArrayList<>();
      for (Dish d : menu) {
         if (d.getType() == type) {
            result.add(d);
         }
      }
      return result;
   }

   /**
    * Returns all dishes with at least the given protein content.
    *
    * @param minProteinInG minimum protein content in grams
    * @return list of high-protein dishes
    */
   public List<Dish> getHighProteinDishes(double minProteinInG) {
      List<Dish> result = new ArrayList<>();
      for (Dish d : menu) {
         if (d.getNutritionValues().getProteinsInG() >= minProteinInG) {
            result.add(d);
         }
      }
      return result;
   }

   /**
    * Returns the name of the restaurant.
    *
    * @return the restaurant name
    */
   public String getName() {
      return name;
   }

   /**
    * Returns the full menu.
    *
    * @return list of all dishes
    */
   public List<Dish> getMenu() {
      return menu;
   }

   @Override
   public int hashCode() {
      return Objects.hash(menu, name);
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
      Restaurant other = (Restaurant) obj;
      return Objects.equals(menu, other.menu) && Objects.equals(name, other.name);
   }

   @Override
   public String toString() {
      return "Restaurant [name=" + name + ", menu=" + menu + "]";
   }

}

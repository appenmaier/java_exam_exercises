package exams1.classdiagrams.restaurant;

import java.util.Objects;

/**
 * A dish available on a restaurant menu.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
class Dish {

   private final String name;
   private double priceInEuro;
   private final DishType type;
   private final NutritionValues nutritionValues;

   /**
    * Creates a dish with the given name, type, and nutrition values.
    *
    * @param name            the name of the dish
    * @param type            the category of the dish
    * @param nutritionValues the nutritional information
    */
   public Dish(String name, DishType type, NutritionValues nutritionValues) {
      this.name = name;
      this.type = type;
      this.nutritionValues = nutritionValues;
   }

   /**
    * Sets the price of the dish in euro.
    *
    * @param priceInEuro the price in euro
    */
   public void setPriceInEuro(double priceInEuro) {
      this.priceInEuro = priceInEuro;
   }

   /**
    * Returns the name of the dish.
    *
    * @return the dish name
    */
   public String getName() {
      return name;
   }

   /**
    * Returns the price of the dish in euro.
    *
    * @return price in euro
    */
   public double getPriceInEuro() {
      return priceInEuro;
   }

   /**
    * Returns the category of the dish.
    *
    * @return the dish type
    */
   public DishType getType() {
      return type;
   }

   /**
    * Returns the nutritional values of the dish.
    *
    * @return nutrition values
    */
   public NutritionValues getNutritionValues() {
      return nutritionValues;
   }

   @Override
   public int hashCode() {
      return Objects.hash(name, nutritionValues, priceInEuro, type);
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
      Dish other = (Dish) obj;
      return Objects.equals(name, other.name)
            && Objects.equals(nutritionValues, other.nutritionValues)
            && Double.doubleToLongBits(priceInEuro) == Double.doubleToLongBits(other.priceInEuro)
            && type == other.type;
   }

   @Override
   public String toString() {
      return "Dish [name=" + name + ", priceInEuro=" + priceInEuro + ", type=" + type
            + ", nutritionValues=" + nutritionValues + "]";
   }

}

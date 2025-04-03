package exams1.classdiagrams.fastfood;

/**
 * MainClass
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class MainClass {

   public static void main(String[] args) {

      Burger burger1 = new Burger("Cheeseburger", FoodCategory.MEAT, 339, false);
      Burger burger2 = new Burger("Veggie-Burger", FoodCategory.VEGETABLES, 246, true);
      FastFood fastFood1 = new FastFood("Pommes Frites", FoodCategory.POTATOES, 291, true);

      FastFoodShop fastFoodShop = new FastFoodShop("Super Burger");

      fastFoodShop.addFastFood(burger1);
      fastFoodShop.addFastFood(burger2);
      fastFoodShop.addFastFood(fastFood1);

      fastFoodShop.rateFastFood(burger1, 4);
      fastFoodShop.rateFastFood(burger1, 3);
      fastFoodShop.rateFastFood(burger1, 5);
      fastFoodShop.rateFastFood(burger2, 4);
      fastFoodShop.rateFastFood(burger2, 5);
      fastFoodShop.rateFastFood(burger2, 5);

      System.out.println("Alle Fast-Food-Gerichte: " + fastFoodShop.fastFood());
      System.out
            .println("Durchschnittsbewertung des Veggie-Burgers: " + burger2.getAverageRating());
      System.out.println("Der bestbewertete Burger: " + fastFoodShop.getBestRatedBurger());

   }

}

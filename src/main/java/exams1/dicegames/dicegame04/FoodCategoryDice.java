package exams1.dicegames.dicegame04;

import java.util.Random;

/**
 * Represents a dice that randomly selects a food category when rolled.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class FoodCategoryDice {

   /**
    * Rolls the dice and returns a randomly selected food category.
    *
    * @return a randomly selected {@link FoodCategory}
    */
   public FoodCategory rollTheDice() {
      Random random = new Random();
      FoodCategory foodCategory =
            FoodCategory.values()[random.nextInt(FoodCategory.values().length)];
      return foodCategory;
   }

}

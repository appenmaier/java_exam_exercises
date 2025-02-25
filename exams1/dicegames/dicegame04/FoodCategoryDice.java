package exams1.dicegames.dicegame04;

import java.util.Random;

/**
 * Lebensmittelkatgorie-Wuerfel
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class FoodCategoryDice {

   public FoodCategory rollTheDice() {
      Random random = new Random();
      FoodCategory foodCategory =
            FoodCategory.values()[random.nextInt(FoodCategory.values().length)];
      return foodCategory;
   }

}

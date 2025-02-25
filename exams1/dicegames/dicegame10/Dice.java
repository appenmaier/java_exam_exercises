package exams1.dicegames.dicegame10;

import java.util.Random;

/**
 * Wuerfel
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Dice {

   public int rollTheDice() {
      Random random = new Random();
      int value = random.nextInt(1, 7);
      return value;
   }

}

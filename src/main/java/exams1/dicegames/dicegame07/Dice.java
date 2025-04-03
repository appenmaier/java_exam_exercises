package exams1.dicegames.dicegame07;

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
      int randomNumber = random.nextInt(1, 7);
      return randomNumber;
   }

}

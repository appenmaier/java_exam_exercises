package exams1.dicegames.dicegame17;

import java.util.Random;

/**
 * A standard six-sided die.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
class Dice {

   /**
    * Rolls the die and returns a random value between 1 and 6 (inclusive).
    *
    * @return a random integer from 1 to 6
    */
   public int rollTheDice() {
      Random random = new Random();
      return random.nextInt(1, 7);
   }

}

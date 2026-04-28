package exams1.dicegames.dicegame10;

import java.util.Random;

/**
 * Represents a standard six-sided dice that returns a random value when rolled.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Dice {

   /** Rolls the dice and returns a random integer between 1 and 6. */
   public int rollTheDice() {
      Random random = new Random();
      int value = random.nextInt(1, 7);
      return value;
   }

}

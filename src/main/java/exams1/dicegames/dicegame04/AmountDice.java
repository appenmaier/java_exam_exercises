package exams1.dicegames.dicegame04;

import java.util.Random;

/**
 * Represents a dice that rolls a random amount between 1 and 6.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class AmountDice {

   /** Rolls the dice and returns a random integer between 1 and 6. */
   public int rollTheDice() {
      Random random = new Random();
      int randomNumber = random.nextInt(1, 7);
      return randomNumber;
   }

}

package exams1.dicegames.dicegame08;

import java.util.Random;

/**
 * Represents a six-sided dice that stores its current value after each roll.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Dice {

   private int value;

   public Dice() {
      rollTheDice();
   }

   /** Rolls the dice and stores a new random value between 1 and 6. */
   public void rollTheDice() {
      Random random = new Random();
      value = random.nextInt(1, 7);
   }

   /** Returns the value from the most recent roll. */
   public int getValue() {
      return value;
   }

}

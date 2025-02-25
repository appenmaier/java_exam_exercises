package exams1.dicegames.dicegame08;

import java.util.Random;

/**
 * Wuerfel
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

   public void rollTheDice() {
      Random random = new Random();
      value = random.nextInt(1, 7);
   }

   public int getValue() {
      return value;
   }

}

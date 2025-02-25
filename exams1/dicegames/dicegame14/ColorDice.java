package exams1.dicegames.dicegame14;

import java.util.Random;

/**
 * Farben-Wuerfel
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class ColorDice {

   private Color color;
   private int value;

   public ColorDice() {
      rollTheDice();
   }

   public Color getColor() {
      return color;
   }

   public int getValue() {
      return value;
   }

   public void rollTheDice() {
      Random random = new Random();
      int randomNumber = random.nextInt(Color.values().length);
      color = Color.values()[randomNumber];
      value = random.nextInt(1, 4);
   }

}

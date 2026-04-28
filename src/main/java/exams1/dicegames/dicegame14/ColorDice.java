package exams1.dicegames.dicegame14;

import java.util.Random;

/**
 * Represents a dice that randomly selects a color and a numeric value when rolled.
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

   /** Returns the color from the most recent roll. */
   public Color getColor() {
      return color;
   }

   /** Returns the numeric value from the most recent roll. */
   public int getValue() {
      return value;
   }

   /** Rolls the dice and randomly assigns a new color and numeric value. */
   public void rollTheDice() {
      Random random = new Random();
      int randomNumber = random.nextInt(Color.values().length);
      color = Color.values()[randomNumber];
      value = random.nextInt(1, 4);
   }

}

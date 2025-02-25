package exams1.dicegames.dicegame09;

import java.util.Random;

/**
 * Farben-Wuerfel
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class ColourDice {

   public Colour rollTheDice() {
      Random random = new Random();
      int randomNumber = random.nextInt(4);
      return switch (randomNumber) {
         case 0  -> Colour.CLUBS;
         case 1  -> Colour.SPADE;
         case 2  -> Colour.HEARTS;
         default -> Colour.DIAMONDS;
      };
   }

}

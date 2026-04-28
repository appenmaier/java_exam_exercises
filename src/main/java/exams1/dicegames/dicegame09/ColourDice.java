package exams1.dicegames.dicegame09;

import java.util.Random;

/**
 * Represents a dice that randomly selects a card suit colour when rolled.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class ColourDice {

   /** Rolls the dice and returns a randomly selected card suit colour. */
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

package exams1.dicegames.dicegame02;

import java.util.Random;

/**
 * Represents a dice that randomly selects a geometric shape symbol when rolled.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class ShapeDice {

   /** Rolls the dice and returns a randomly selected shape symbol. */
   public ShapeSymbol rollTheDice() {
      Random random = new Random();
      int randomNumber = random.nextInt(3);
      return switch (randomNumber) {
         case 0  -> ShapeSymbol.CIRCLE;
         case 1  -> ShapeSymbol.TRIANGLE;
         default -> ShapeSymbol.RECTANGLE;
      };
   }

}

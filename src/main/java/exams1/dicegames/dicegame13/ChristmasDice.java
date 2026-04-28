package exams1.dicegames.dicegame13;

import java.util.Random;

/**
 * Represents a dice that randomly selects a Christmas symbol when rolled.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class ChristmasDice {

   private ChristmasSymbol value;

   public ChristmasDice() {
      rollTheDice();
   }

   /** Rolls the dice and stores a randomly selected Christmas symbol. */
   public void rollTheDice() {
      Random random = new Random();
      int randomNumber = random.nextInt(1, 4);
      value = switch (randomNumber) {
         case 1  -> ChristmasSymbol.STAR;
         case 2  -> ChristmasSymbol.TREE;
         default -> ChristmasSymbol.CANDLE;
      };
   }

   /** Returns the Christmas symbol from the most recent roll. */
   public ChristmasSymbol getValue() {
      return value;
   }

}

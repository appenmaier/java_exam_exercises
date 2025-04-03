package exams1.dicegames.dicegame13;

import java.util.Random;

/**
 * Weihnachts-Wuerfel
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

   public void rollTheDice() {
      Random random = new Random();
      int randomNumber = random.nextInt(1, 4);
      value = switch (randomNumber) {
         case 1  -> ChristmasSymbol.STAR;
         case 2  -> ChristmasSymbol.TREE;
         default -> ChristmasSymbol.CANDLE;
      };
   }

   public ChristmasSymbol getValue() {
      return value;
   }

}

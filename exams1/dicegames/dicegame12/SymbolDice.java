package exams1.dicegames.dicegame12;

import java.util.Random;

/**
 * Symbol-Wuerfel
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class SymbolDice {

   public Symbol rollTheDice() {
      Random random = new Random();
      int randomNumber = random.nextInt(3);
      return switch (randomNumber) {
         case 0  -> Symbol.PAPER;
         case 1  -> Symbol.SCISSORS;
         default -> Symbol.ROCK;
      };
   }

}

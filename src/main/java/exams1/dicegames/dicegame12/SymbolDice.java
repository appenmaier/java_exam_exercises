package exams1.dicegames.dicegame12;

import java.util.Random;

/**
 * Represents a dice that randomly selects a rock-paper-scissors symbol when rolled.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class SymbolDice {

   /** Rolls the dice and returns a randomly selected rock-paper-scissors symbol. */
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

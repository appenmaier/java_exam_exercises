package exams1.dicegames.dicegame10;

import java.util.Random;

/**
 * Represents a dice that randomly selects a combat symbol when rolled.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class SymbolDice {

   private Symbol symbol;

   public SymbolDice() {
      rollTheDice();
   }

   /** Rolls the dice and randomly assigns either a SWORD or SHIELD symbol. */
   public void rollTheDice() {
      Random random = new Random();
      boolean randomNumber = random.nextBoolean();
      symbol = randomNumber ? Symbol.SHIELD : Symbol.SWORD;
   }

   /** Returns the symbol from the most recent roll. */
   public Symbol getSymbol() {
      return symbol;
   }

}

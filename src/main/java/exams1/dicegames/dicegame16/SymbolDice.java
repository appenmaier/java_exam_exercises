package exams1.dicegames.dicegame16;

import java.util.Random;

/**
 * Represents a weighted dice that selects a symbol based on configurable counts of skulls and hearts.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class SymbolDice {

   private final Symbol[] symbols;
   private Symbol symbol;

   public SymbolDice(int skulls, int hearts) {
      symbols = new Symbol[skulls + hearts];
      for (int i = 0; i < skulls; i++) {
         symbols[i] = Symbol.SKULL;
      }
      for (int i = skulls; i < skulls + hearts; i++) {
         symbols[i] = Symbol.HEART;
      }
      rollTheDice();
   }

   /** Rolls the dice and randomly assigns a new symbol based on the configured distribution. */
   public void rollTheDice() {
      Random random = new Random();
      int randomNumber = random.nextInt(symbols.length);
      symbol = symbols[randomNumber];
   }

   /** Returns the symbol from the most recent roll. */
   public Symbol getSymbol() {
      return symbol;
   }

}

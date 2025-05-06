package exams1.dicegames.dicegame16;

import java.util.Random;

/**
 * Symbol-Wuerfel
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

   public void rollTheDice() {
      Random random = new Random();
      int randomNumber = random.nextInt(symbols.length);
      symbol = symbols[randomNumber];
   }

   public Symbol getSymbol() {
      return symbol;
   }

}

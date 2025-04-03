package exams1.dicegames.dicegame10;

import java.util.Random;

/**
 * Symbol-Wuerfel
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

   public void rollTheDice() {
      Random random = new Random();
      boolean randomNumber = random.nextBoolean();
      symbol = randomNumber ? Symbol.SHIELD : Symbol.SWORD;
   }

   public Symbol getSymbol() {
      return symbol;
   }

}

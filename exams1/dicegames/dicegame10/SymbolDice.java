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

   public Symbol rollTheDice() {
      Random random = new Random();
      boolean randomNumber = random.nextBoolean();
      return randomNumber ? Symbol.SHIELD : Symbol.SWORD;
   }

}

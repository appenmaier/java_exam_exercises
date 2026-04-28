package exams1.dicegames.dicegame11;

import java.util.Random;

/**
 * Represents a dice that rolls a random five-character lowercase string.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class StringDice {

   /** Rolls the dice and returns a randomly generated five-character lowercase string. */
   public String rollTheDice() {
      String string = "";
      String alphabet = "abcdefghijklmnopqrstuvwxyz";
      Random random = new Random();
      for (int i = 0; i < 5; i++) {
         int randomNumber = random.nextInt(alphabet.length());
         string += alphabet.charAt(randomNumber);
      }
      return string;
   }

}

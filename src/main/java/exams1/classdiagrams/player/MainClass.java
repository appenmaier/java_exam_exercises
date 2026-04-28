package exams1.classdiagrams.player;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

/**
 * Demonstrates reading game tokens from a file and printing them in random order.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class MainClass {

   public static void main(String[] args) throws FileNotFoundException {
      List<GameToken> gameTokens =
            GameTokens.getGameTokens(new File("src/main/resources/gametokens.txt"));

      System.out.println("Alle Spielfiguren: " + gameTokens);
   }

}

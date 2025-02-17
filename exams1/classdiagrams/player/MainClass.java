package exams1.classdiagrams.player;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

/**
 * MainClass
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class MainClass {

   public static void main(String[] args) throws FileNotFoundException {

      List<GameToken> gameTokens =
            GameTokens.getGameTokens(new File("exams1/classdiagrams/gametokens/gametokens.txt"));

      System.out.println("Alle Spielfiguren: " + gameTokens);

   }

}

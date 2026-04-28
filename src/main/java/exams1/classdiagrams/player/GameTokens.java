package exams1.classdiagrams.player;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Provides a factory method to read a list of game tokens from a file.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class GameTokens {

   /** Reads game tokens from the given file and returns them in a randomly interleaved list. */
   public static List<GameToken> getGameTokens(File file) throws FileNotFoundException {
      List<GameToken> gameTokens = new ArrayList<GameToken>();
      Scanner sc = new Scanner(file);
      Random random = new Random();

      while (sc.hasNextLine()) {
         String line = sc.nextLine();
         String[] tokens = line.split(";");
         GameTokenType type = GameTokenType.valueOf(tokens[0]);
         GameTokenColor color = GameTokenColor.valueOf(tokens[1]);
         Integer value = Integer.valueOf(tokens[2]);
         GameToken gameToken = new GameToken(type, color, value);
         int index = gameTokens.size() == 0 ? 0 : random.nextInt(gameTokens.size());
         gameTokens.add(index, gameToken);
      }

      sc.close();
      return gameTokens;
   }

}

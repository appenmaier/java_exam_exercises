package exams1.classdiagrams.cardsdealer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Reads a list of cards from a semicolon-delimited file.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class CardsReader {

   /** Parses the given file and returns a list of cards read from it. */
   public static List<Card> getCards(File file) throws FileNotFoundException {
      List<Card> cards = new ArrayList<>();
      Scanner sc = new Scanner(file);

      while (sc.hasNextLine()) {
         String line = sc.nextLine();
         String[] tokens = line.split(";");
         String colour = tokens[0];
         int value = Integer.valueOf(tokens[1]);
         Card card = new Card(colour, value);
         cards.add(card);
      }

      sc.close();
      return cards;
   }

}

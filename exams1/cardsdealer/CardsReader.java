package exams1.cardsdealer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * CardsReader
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class CardsReader {

  public static List<Card> getCards(File file) throws FileNotFoundException {
    List<Card> cards = new ArrayList<>();
    Scanner sc = new Scanner(file);

    while (sc.hasNextLine()) {
      String line = sc.next();
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

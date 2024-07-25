package exams1.creature;

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

    List<Creature> creatures =
        CreaturesReader.getCreatures(new File("jappuccini/exams1/creatures/creatures.txt"));

    System.out.println("Alle Kreaturen: " + creatures);

  }

}

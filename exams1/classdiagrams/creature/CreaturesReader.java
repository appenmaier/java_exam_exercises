package exams1.classdiagrams.creature;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * CreaturesReader
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class CreaturesReader {

  public static List<Creature> getCreatures(File file) throws FileNotFoundException {
    List<Creature> creatures = new ArrayList<>();
    Scanner sc = new Scanner(file);

    while (sc.hasNextLine()) {
      String line = sc.nextLine();
      String[] tokens = line.split(";");
      String name = tokens[0];
      Type type = Type.valueOf(tokens[1]);
      int x = Integer.valueOf(tokens[2]);
      int y = Integer.valueOf(tokens[3]);
      Position position = new Position(x, y);
      Creature creature = new Creature(name, type, position);
      creatures.add(creature);

      line = sc.nextLine();
      tokens = line.split(";");
      for (String t : tokens) {
        switch (t) {
          case "UP" -> creature.moveUp();
          case "DOWN" -> creature.moveDown();
          case "LEFT" -> creature.moveLeft();
          case "RIGHT" -> creature.moveRight();
        }
      }
    }

    sc.close();
    return creatures;
  }

}

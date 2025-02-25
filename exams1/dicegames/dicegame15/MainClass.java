package exams1.dicegames.dicegame15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * MainClass
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class MainClass {

   private static Player player;
   private static List<Dice> dices;
   private static Scanner scanner;
   private static int rounds;
   private static int points;

   public static void main(String[] args) {
      scanner = new Scanner(System.in);

      System.out.print("Bitte gib Deinen Namen ein: ");
      String name = scanner.nextLine();

      System.out.print("Bitte gib die Anzahl Würfel ein: ");
      int numberOfDices = scanner.nextInt();

      System.out.print("Bitte gib die Zielpunktzahl ein: ");
      points = scanner.nextInt();

      dices = new ArrayList<>();
      for (int i = 0; i < numberOfDices; i++) {
         dices.add(new Dice());
      }
      player = new Player(name, 0);

      System.out.println();
      while (player.getPoints() < points) {
         rounds++;

         int value = 0;
         for (Dice d : dices) {
            d.rollTheDice();
            value += d.getValue();
         }
         player.setPoints(player.getPoints() + value);

         System.out.println("Gespielte Runden: " + rounds);
         System.out.println("Erzielte Punkte in dieser Runde: " + value);
         System.out.println("Erzielte Punkte insgesamt: " + player.getPoints());
         System.out.println(
               "Erzielte Punkte pro Wurf in dieser Runde: " + ((double) value / numberOfDices));
         System.out.println();
      }
   }

}

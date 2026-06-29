package exams1.dicegames.dicegame17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Entry point for dice game 17. Two players each roll five dice per round over five rounds.
 * The player with the higher total each round earns points equal to the difference.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class MainClass {

   private static List<Dice> dices;
   private static int points1;
   private static int points2;
   private static String name1;
   private static String name2;

   /**
    * Runs the dice game by reading player names and simulating five rounds.
    *
    * @param args command-line arguments (not used)
    */
   @SuppressWarnings("resource")
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      dices = new ArrayList<>();

      for (int i = 0; i < 5; i++) {
         Dice dice = new Dice();
         dices.add(dice);
      }

      System.out.print("Spieler 1, bitte Namen eingeben: ");
      name1 = scanner.nextLine();
      System.out.print("Spieler 2, bitte Namen eingeben: ");
      name2 = scanner.nextLine();

      System.out.println();
      System.out.println("Runde - Wurfwert " + name1 + " - Wurfwert " + name2 + " - Differenz");

      for (int round = 1; round <= 5; round++) {
         int total1 = 0;
         int total2 = 0;

         for (Dice d : dices) {
            total1 += d.rollTheDice();
            total2 += d.rollTheDice();
         }

         int differenz;
         if (total2 > total1) {
            differenz = total2 - total1;
         } else {
            differenz = total1 - total2;
         }

         if (total1 > total2) {
            points1 += differenz;
         } else if (total2 > total1) {
            points2 += differenz;
         }

         System.out.println(round + " - " + total1 + " - " + total2 + " - " + differenz);
      }

      System.out.println();
      System.out.println(name1 + ": " + points1 + " Punkte");
      System.out.println(name2 + ": " + points2 + " Punkte");
   }

}

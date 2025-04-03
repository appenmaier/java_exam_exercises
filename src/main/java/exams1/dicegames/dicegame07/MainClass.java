package exams1.dicegames.dicegame07;

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

   private static List<Dice> dices;
   private static Scanner scanner;
   private static int rounds;
   private static int points;

   public static void main(String[] args) {
      scanner = new Scanner(System.in);

      dices = new ArrayList<>();
      for (int i = 0; i < 5; i++) {
         Dice dice = new Dice();
         dices.add(dice);
      }
      boolean loop;
      do {
         rounds++;
         int sum = 0;
         for (Dice d : dices) {
            sum += d.rollTheDice();
         }
         System.out.print("Wurf groesser 17?: ");
         boolean tip = scanner.nextBoolean();
         if ((sum > 17 && tip) || (sum < 17 && !tip)) {
            System.out.println("Richtig, der Wurf war " + sum);
            points++;
         } else {
            System.out.println("Falsch, der Wurf war " + sum);
         }
         System.out.print("Nochmal?: ");
         loop = scanner.nextBoolean();
         System.out.println();
      } while (loop);
      System.out.println("Runden: " + rounds + " Punkte: " + points);
   }

}

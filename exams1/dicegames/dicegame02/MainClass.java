package exams1.dicegames.dicegame02;

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

   private static Scanner scanner;
   private static List<Dice> dices;
   private static int points;
   private static int rounds;

   public static void main(String[] args) {

      scanner = new Scanner(System.in);

      dices = new ArrayList<>();
      for (int i = 0; i < 5; i++) {
         dices.add(new Dice());
      }

      boolean repeat;
      do {
         rounds++;
         System.out.print("Ist die Anzahl Ecken hoeher als 12 (Ja, Nein)?: ");
         String tip = scanner.next();
         int total = 0;
         for (int i = 0; i < dices.size(); i++) {
            Dice d = dices.get(i);
            ShapeSymbol shapeSymbol = d.rollTheDice();
            total += shapeSymbol.corners();
         }
         if (total > 12 && tip.equals("Ja") || total <= 12 && tip.equals("Nein")) {
            points++;
            System.out.println("Richtig (" + total + ")");
         } else {
            System.out.println("Falsch (" + total + ")");
         }
         System.out.print("Moechtest Du eine weitere Runde spielen (Ja, Nein)?: ");
         repeat = scanner.next().equals("Ja");
         System.out.println();
      } while (repeat);

      System.out.println("Gespielte Runden: " + rounds);
      System.out.println("Erzielte Punkte: " + points);

   }

}

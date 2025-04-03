package exams1.dicegames.dicegame13;

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
   private static ChristmasDice dice;
   private static int rounds;
   private static int points;

   public static void main(String[] args) {
      scanner = new Scanner(System.in);

      System.out.print("Wie viele Runden moechtest Du spielen?: ");
      rounds = scanner.nextInt();

      dice = new ChristmasDice();

      System.out.println();
      for (int i = 0; i < rounds; i++) {
         System.out.println("Runde " + (i + 1) + ":");

         dice.rollTheDice();
         ChristmasSymbol symbol = dice.getValue();

         System.out.print("Rate, welches Symbol gewuerfelt wurde (1-Stern, 2-Baum, 3-Kerze): ");
         int tip = scanner.nextInt();

         ChristmasSymbol temp = switch (tip) {
            case 1  -> ChristmasSymbol.STAR;
            case 2  -> ChristmasSymbol.TREE;
            default -> ChristmasSymbol.CANDLE;
         };
         if (symbol == temp) {
            System.out.println("Richtig, Du erhaelst einen Punkt");
            points++;
         } else {
            System.out.println("Falsch, Du erhaelst leider keinen Punkt");
         }
         System.out.println();
      }
      System.out.println("Ergebnis");
      System.out.println("Anzahl Runden: " + rounds);
      System.out.println("Deine Punkte: " + points);
      System.out.println("Deine Trefferquote " + (100.0 * points / rounds) + "%");
   }

}

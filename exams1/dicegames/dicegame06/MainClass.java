package exams1.dicegames.dicegame06;

import java.util.Scanner;

/**
 * MainClass
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class MainClass {

   private static Dice dice1;
   private static Dice dice2;
   private static Dice dice3;
   private static int points1;
   private static int points2;
   private static String name1;
   private static String name2;

   @SuppressWarnings("resource")
   public static void main(String[] args) {
      dice1 = new Dice();
      dice2 = new Dice();
      dice3 = new Dice();

      Scanner scanner = new Scanner(System.in);
      System.out.print("Spieler 1, bitte Namen eingeben: ");
      name1 = scanner.next();
      System.out.print("Spieler 2, bitte Namen eingeben: ");
      name2 = scanner.next();

      System.out.println();
      System.out.printf("| Runde | %10s | %10s |%n", name1, name2);
      System.out.println("| ----- | ---------- | ---------- |");
      for (int i = 0; i < 5; i++) {
         int temp1 = dice1.rollTheDice() + dice2.rollTheDice() + dice3.rollTheDice();
         int temp2 = dice1.rollTheDice() + dice2.rollTheDice() + dice3.rollTheDice();
         if (temp1 > temp2) {
            points1++;
         } else if (temp2 > temp1) {
            points2++;
         } else {
            points1++;
            points2++;
         }
         System.out.printf("| %5d | %10d | %10d |%n", i + 1, temp1, temp2);
      }
      System.out.println();
      System.out.println(name1 + ": " + points1 + " Punkte");
      System.out.println(name2 + ": " + points2 + " Punkte");
      System.out.println(points1 > points2 ? name1 + " gewinnt"
            : points2 > points1 ? name2 + " gewinnt" : "Beide gewinnen");
   }

}

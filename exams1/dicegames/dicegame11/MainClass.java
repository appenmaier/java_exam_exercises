package exams1.dicegames.dicegame11;

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
   private static String name1;
   private static String name2;
   private static int points1;
   private static int points2;
   private static StringDice dice;

   public static void main(String[] args) {
      scanner = new Scanner(System.in);

      System.out.print("Gib bitte den Namen von Spieler 1 ein: ");
      name1 = scanner.next();

      System.out.print("Gib bitte den Namen von Spieler 2 ein: ");
      name2 = scanner.next();

      System.out.print("Gib bitte die erforderlichen Punkte ein: ");
      int points = scanner.nextInt();

      dice = new StringDice();

      System.out.println();
      while (points1 < points && points2 < points) {
         String text1 = dice.rollTheDice();
         System.out.println(name1 + " wuerfelt " + "\"" + text1 + "\", der Hashwert betraegt "
               + text1.hashCode());
         String text2 = dice.rollTheDice();
         System.out.println(name2 + " wuerfelt " + "\"" + text2 + "\", der Hashwert betraegt "
               + text2.hashCode());
         int value1 = text1.hashCode();
         int value2 = text2.hashCode();
         if (value1 > value2) {
            System.out.println(name1 + " bekommt einen Punkt");
            points1++;
         } else if (value2 > value1) {
            System.out.println(name2 + " bekommt einen Punkt");
            points2++;
         } else {
            System.out.println("Keiner bekommt einen Punkt");
         }
         System.out.println();
      }
      System.out.println(name1 + ": " + points1);
      System.out.println(name2 + ": " + points2);
   }

}

package exams1.dicegames.dicegame08;

import java.util.Scanner;

/**
 * MainClass
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class MainClass {

   private static Player player1;
   private static Player player2;
   private static Scanner scanner;
   private static int rounds;

   public static void main(String[] args) {
      scanner = new Scanner(System.in);

      System.out.print("Bitte den Namen von Spieler 1 eingeben: ");
      String name1 = scanner.nextLine();
      player1 = new Player(name1);

      System.out.print("Bitte den Namen von Spieler 2 eingeben: ");
      String name2 = scanner.nextLine();
      player2 = new Player(name2);

      System.out.println();
      while (player1.getPoints() <= 50 && player2.getPoints() <= 50) {
         rounds++;
         System.out.println("Runde: " + rounds);
         int value1 = player1.rollTheDice();
         System.out.println(player1.name() + " würfelt " + value1);
         int value2 = player1.rollTheDice();
         System.out.println(player2.name() + " würfelt " + value2);
         player2.setPoints(player2.getPoints() + value2);
         player1.setPoints(player1.getPoints() + value1);
         System.out.println();
      }
      System.out.println("Punktzahl " + player1.name() + ": " + player1.getPoints());
      System.out.println("Punktzahl " + player2.name() + ": " + player2.getPoints());
   }

}

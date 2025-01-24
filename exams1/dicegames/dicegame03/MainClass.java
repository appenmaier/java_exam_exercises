package exams1.dicegames.dicegame03;

import java.util.Scanner;

public class MainClass {

   private static Player player1;
   private static Player player2;
   private static Scanner scanner;

   public static void main(String[] args) {

      scanner = new Scanner(System.in);

      System.out.print("Spieler 1, gib bitte Deinen Namen ein: ");
      String name1 = scanner.nextLine();
      player1 = new Player(name1);

      System.out.print("Spieler 2, gib bitte Deinen Namen ein: ");
      String name2 = scanner.nextLine();
      player2 = new Player(name2);

      System.out.println();

      while (player1.getHealthPoints() > 0 && player2.getHealthPoints() > 0) {
         System.out.println(player1.name() + " hat " + player1.getHealthPoints() + " Lebenspunkte");
         System.out.println(player2.name() + " hat " + player2.getHealthPoints() + " Lebenspunkte");
         int value1 = player1.rollTheDice();
         System.out.println(player1.name() + " wuerfelt eine " + value1);
         int value2 = player2.rollTheDice();
         System.out.println(player2.name() + " wuerfelt eine " + value2);
         if (value1 > value2) {
            player2.reduceHealthPoints(1);
            System.out.println(player2.name() + " verliert einen Punkt");
         } else if (value2 > value1) {
            player1.reduceHealthPoints(1);
            System.out.println(player1.name() + " verliert einen Punkt");
         }
         System.out.println();
      }

      if (player1.getHealthPoints() > player2.getHealthPoints()) {
         System.out.println(player1.name() + " gewinnt");
      } else {
         System.out.println(player2.name() + " gewinnt");
      }

   }

}

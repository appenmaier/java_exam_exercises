package exams1.dicegames.dicegame09;

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
   private static Player player1;
   private static Player player2;
   private static int rounds;
   private static ColourDice dice;

   public static void main(String[] args) {
      scanner = new Scanner(System.in);

      System.out.print("Bitte den Namen von Spieler 1 eingeben: ");
      String name1 = scanner.nextLine();
      player1 = new Player(name1);

      System.out.print("Bitte den Namen von Spieler 2 eingeben: ");
      String name2 = scanner.nextLine();
      player2 = new Player(name2);

      System.out.print("Bitte die Anzahl Runden eingeben: ");
      rounds = scanner.nextInt();

      dice = new ColourDice();

      System.out.println();
      for (int i = 0; i < rounds; i++) {
         System.out.println("Runde: " + (i + 1));
         Colour value1 = dice.rollTheDice();
         System.out.println(player1.name() + " würfelt " + value1.getDescription());
         dice.rollTheDice();
         Colour value2 = dice.rollTheDice();
         System.out.println(player2.name() + " würfelt " + value2.getDescription());
         if (value1.getPriority() > value2.getPriority()) {
            System.out.println(player2.name() + " erzielt einen Punkt");
            player2.setPoints(player2.getPoints() + 1);
         } else if (value1.getPriority() < value2.getPriority()) {
            System.out.println(player1.name() + " erzielt einen Punkt");
            player1.setPoints(player1.getPoints() + 1);
         } else {
            System.out.println("Keiner erzielt einen Punkt");
         }
         System.out.println();
      }
      System.out.println("Punktzahl " + player1.name() + ": " + player1.getPoints());
      System.out.println("Punktzahl " + player2.name() + ": " + player2.getPoints());
   }

}

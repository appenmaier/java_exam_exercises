package exams1.dicegames.dicegame12;

import java.util.Scanner;

/**
 * MainClass
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class MainClass {

   private static SymbolDice dice1;
   private static SymbolDice dice2;
   private static Player player1;
   private static Player player2;
   private static Scanner scanner;

   public static void main(String[] args) {
      scanner = new Scanner(System.in);

      System.out.print("Spieler 1, bitte gib Deinen Namen ein: ");
      String name1 = scanner.next();
      System.out.print("Spieler 2, bitte gib Deinen Namen ein: ");
      String name2 = scanner.next();

      player1 = new Player(name1);
      player2 = new Player(name2);

      dice1 = new SymbolDice();
      dice2 = new SymbolDice();

      System.out.println();
      for (int i = 0; i < 5; i++) {
         Symbol symbol1 = dice1.rollTheDice();
         Symbol symbol2 = dice2.rollTheDice();

         System.out.println(player1.name() + " wuerfelt " + symbol1 + ", " + player2.name()
               + " wuerfelt " + symbol2);
         if (symbol1.equals(symbol2)) {
            System.out.println("Keiner bekommt einen Punkt");
         } else if (symbol1.equals(Symbol.SCISSORS) && symbol2.equals(Symbol.PAPER)
               || symbol1.equals(Symbol.ROCK) && symbol2.equals(Symbol.SCISSORS)
               || symbol1.equals(Symbol.PAPER) && symbol2.equals(Symbol.ROCK)) {
            System.out.println("Punkt für " + player1.name());
            player1.increasePoints(1);
         } else {
            System.out.println("Punkt für " + player2.name());
            player2.increasePoints(1);
         }
         System.out.println();
      }
      if (player1.getPoints() > player2.getPoints()) {
         System.out.println(player1.name() + " gewinnt");
      } else if (player2.getPoints() > player1.getPoints()) {
         System.out.println(player2.name() + " gewinnt");
      } else {
         System.out.println("Keiner gewinnt");
      }
   }

}

package exams1.dicegames.dicegame10;

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
   private static SymbolDice symbolDice;
   private static Dice dice;
   private static int rounds;

   public static void main(String[] args) {
      scanner = new Scanner(System.in);

      System.out.print("Spieler 1, bitte Namen eingeben: ");
      String name1 = scanner.next();

      System.out.print("Spieler 2, bitte Namen eingeben: ");
      String name2 = scanner.next();

      player1 = new Player(name1);
      player2 = new Player(name2);

      symbolDice = new SymbolDice();
      dice = new Dice();

      System.out.println();
      while (player1.getPoints() > 0 && player2.getPoints() > 0) {
         rounds++;
         System.out.println("Runde " + rounds);
         move(player1, player2);
         if (player2.getPoints() <= 0) {
            break;
         }
         move(player2, player1);
      }
      if (player1.getPoints() <= 0) {
         System.out.println(player2.name() + " gewinnt");
      } else {
         System.out.println(player1.name() + " gewinnt");
      }
   }

   private static void move(Player attacker, Player defender) {
      int swords = symbolDice.rollTheDice().equals(Symbol.SWORD) ? dice.rollTheDice() : 0;
      int shields = symbolDice.rollTheDice().equals(Symbol.SHIELD) ? dice.rollTheDice() : 0;
      int damage = (swords > shields) ? swords - shields : 0;
      int points = (defender.getPoints() > damage) ? defender.getPoints() - damage : 0;
      defender.setPoints(points);
      System.out.println(attacker.name() + " würfelt " + swords + " Schwerter");
      System.out.println(defender.name() + " würfelt " + shields + " Schilde");
      if (defender.getPoints() <= 0) {
         System.out.println(
               defender.name() + " erleidet " + damage + " Schaden und besitzt keine Punkte mehr");
      } else {
         System.out.println(defender.name() + " erleidet " + damage + " Schaden und besitzt noch "
               + defender.getPoints() + " Punkte");
      }
      System.out.println();
   }

}

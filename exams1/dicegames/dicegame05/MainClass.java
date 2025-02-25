package exams1.dicegames.dicegame05;

import java.util.ArrayList;
import java.util.List;

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
   private static List<Player> players;
   private static int rounds;

   public static void main(String[] args) {
      dice1 = new Dice();
      dice2 = new Dice();

      players = new ArrayList<>();
      Player player1 = new Player();
      Player player2 = new Player();
      players.add(player1);
      players.add(player2);

      System.out.println("| Runde | Spieler 1 | Spieler 2 |");
      System.out.println("| ----- | --------- | --------- |");
      while (player1.getScore() < 50 && player2.getScore() < 50) {
         rounds++;
         for (Player player : players) {
            int score = player.getScore() + dice1.rollTheDice() + dice2.rollTheDice();
            player.setScore(score);
         }
         System.out.printf("| %5d | %9d | %9d |%n", rounds, player1.getScore(), player2.getScore());
      }
   }

}

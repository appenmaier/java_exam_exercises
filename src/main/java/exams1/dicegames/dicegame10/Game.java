package exams1.dicegames.dicegame10;

import java.util.ArrayList;
import java.util.List;

/**
 * Spiel
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Game {

   private Player player1;
   private Player player2;
   private List<SymbolDice> dices;
   private int rounds;

   public Game(String name1, String name2, int numberOfDices) {
      player1 = new Player(name1);
      player2 = new Player(name2);
      dices = new ArrayList<>();
      for (int i = 0; i < numberOfDices; i++) {
         dices.add(new SymbolDice());
      }
   }

   public void play() {
      while (player1.getPoints() > 0 && player2.getPoints() > 0) {
         rounds++;
         System.out.println("Runde " + rounds);
         move(player1, player2);
         if (player2.getPoints() <= 0) {
            break;
         }
         move(player2, player1);
      }
   }

   private void move(Player attacker, Player defender) {
      rollTheDices();
      int swords = getNumberOfSymbols(Symbol.SWORD);
      int shields = getNumberOfSymbols(Symbol.SHIELD);
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

   private void rollTheDices() {
      for (SymbolDice d : dices) {
         d.rollTheDice();
      }
   }

   private int getNumberOfSymbols(Symbol symbol) {
      int value = 0;
      for (SymbolDice d : dices) {
         if (d.getSymbol().equals(symbol)) {
            value++;
         }
      }
      return value;
   }

}

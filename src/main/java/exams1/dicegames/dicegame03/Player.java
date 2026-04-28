package exams1.dicegames.dicegame03;

/**
 * Represents a player in the dice game who has a name, health points, and their own dice.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Player {

   private final String name;
   private int healthPoints;
   private final Dice dice;

   public Player(String name, int healthPoints) {
      this.name = name;
      this.healthPoints = healthPoints;
      dice = new Dice();
   }

   /** Returns the name of this player. */
   public String name() {
      return name;
   }

   /** Returns the current health points of this player. */
   public int getHealthPoints() {
      return healthPoints;
   }

   /** Rolls this player's dice and returns the result. */
   public int rollTheDice() {
      return dice.rollTheDice();
   }

   /** Reduces this player's health points by the given number of points. */
   public void reduceHealthPoints(int points) {
      healthPoints -= points;
   }

}

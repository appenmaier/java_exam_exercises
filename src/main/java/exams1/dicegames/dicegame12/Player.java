package exams1.dicegames.dicegame12;

/**
 * Represents a player in the dice game who accumulates points over multiple rounds.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Player {

   private final String name;
   private int points;

   public Player(String name) {
      this.name = name;
   }

   /** Returns the current points of this player. */
   public int getPoints() {
      return points;
   }

   /** Increases this player's points by the given value. */
   public void increasePoints(int value) {
      points += value;
   }

   /** Returns the name of this player. */
   public String name() {
      return name;
   }

}

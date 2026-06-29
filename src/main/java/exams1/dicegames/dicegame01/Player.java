package exams1.dicegames.dicegame01;

/**
 * Represents a player in the dice game who has a name and a points total.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Player {

   private final String name;
   private int points;

   /**
    * Creates a player with the given name and starting points.
    *
    * @param name   the player's name
    * @param points the initial points of the player
    */
   public Player(String name, int points) {
      this.name = name;
      this.points = points;
   }

   /** Returns the current points of this player. */
   public int getPoints() {
      return points;
   }

   /** Returns the name of this player. */
   public String name() {
      return name;
   }

   /** Reduces this player's points by the given value. */
   public void reducePoints(int value) {
      points -= value;
   }

}

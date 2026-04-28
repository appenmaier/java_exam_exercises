package exams1.dicegames.dicegame10;

/**
 * Represents a player in the dice game who starts with 10 points and loses points when attacked.
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
      points = 10;
   }

   /** Returns the current points of this player. */
   public int getPoints() {
      return points;
   }

   /** Sets the points of this player to the given value. */
   public void setPoints(int points) {
      this.points = points;
   }

   /** Returns the name of this player. */
   public String name() {
      return name;
   }

}

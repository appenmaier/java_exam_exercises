package exams1.dicegames.dicegame12;

/**
 * Spieler
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

   public int getPoints() {
      return points;
   }

   public void increasePoints(int value) {
      points += value;
   }

   public String name() {
      return name;
   }

}

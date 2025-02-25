package exams1.dicegames.dicegame15;

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

   public Player(String name, int points) {
      this.name = name;
      this.points = points;
   }

   public int getPoints() {
      return points;
   }

   public void setPoints(int points) {
      this.points = points;
   }

   public String name() {
      return name;
   }

}

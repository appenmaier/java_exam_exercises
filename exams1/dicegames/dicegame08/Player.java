package exams1.dicegames.dicegame08;

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
   private final Dice dice;

   public Player(String name) {
      this.name = name;
      dice = new Dice();
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

   public int rollTheDice() {
      dice.rollTheDice();
      return dice.getValue();
   }

}

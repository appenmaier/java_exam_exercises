package exams1.dicegames.dicegame05;

/**
 * Represents a player in the dice game who tracks a score.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Player {

   private int score;

   /** Returns the current score of this player. */
   public int getScore() {
      return score;
   }

   /** Sets the score of this player to the given value. */
   public void setScore(int score) {
      this.score = score;
   }

}

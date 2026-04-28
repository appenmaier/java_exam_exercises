package exams1.dicegames.dicegame10;

/**
 * Starts a two-player sword-and-shield dice battle with five symbol dice.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class MainClass {

   public static void main(String[] args) {
      Game game = new Game("Hans", "Peter", 5);
      game.play();
   }

}

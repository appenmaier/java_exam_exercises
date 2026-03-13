package exams1.dicegames.dicegame03;

public class Player {

   private final String name;
   private int healthPoints;
   private final Dice dice;

   public Player(String name, int healthPoints) {
      this.name = name;
      this.healthPoints = healthPoints;
      dice = new Dice();
   }

   public String name() {
      return name;
   }

   public int getHealthPoints() {
      return healthPoints;
   }

   public int rollTheDice() {
      return dice.rollTheDice();
   }

   public void reduceHealthPoints(int points) {
      healthPoints -= points;
   }

}

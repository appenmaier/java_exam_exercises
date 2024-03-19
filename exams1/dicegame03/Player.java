package exams1.dicegame03;

public class Player {

  private final String name;
  private int healthPoints;
  private final Dice dice;

  public Player(String name) {
    this.name = name;
    healthPoints = 10;
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

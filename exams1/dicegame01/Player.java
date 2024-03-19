package exams1.dicegame01;

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

  public String name() {
    return name;
  }

  public void reducePoints(int value) {
    points -= value;
  }

}

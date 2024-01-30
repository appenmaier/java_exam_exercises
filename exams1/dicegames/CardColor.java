package exams1.dicegames;

/**
 * Kartenfarbe
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public enum CardColor {

  CLUBS("Kreuz", 1), DIAMONDS("Karo", 4), HEARTS("Herz", 3), SPADE("Pik", 2);

  private final String description;
  private final int priority;

  private CardColor(String description, int priority) {
    this.description = description;
    this.priority = priority;
  }

  public String getDescription() {
    return description;
  }

  public int getPriority() {
    return priority;
  }

}

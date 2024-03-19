package exams1.dicegame01;

/**
 * Waffe
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public enum Weapon {

  SWORD("Schwert", 4), SPEAR("Speer", 2), AXE("Axt", 3), CLUB("Keule", 1);

  private final String description;
  private final int power;

  Weapon(String description, int power) {
    this.description = description;
    this.power = power;
  }

  public String description() {
    return description;
  }

  public int power() {
    return power;
  }

}

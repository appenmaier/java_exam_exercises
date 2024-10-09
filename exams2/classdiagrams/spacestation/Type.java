package exams2.classdiagrams.spacestation;

/**
 * Typ
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public enum Type {

  A_WING(1300), B_WING(950), X_WING(1050), Y_WING(1000), TIE_FIGHTER(1200);

  private final int maxSpeed;

  Type(int maxSpeed) {
    this.maxSpeed = maxSpeed;
  }

  public int maxSpeed() {
    return maxSpeed;
  }

}

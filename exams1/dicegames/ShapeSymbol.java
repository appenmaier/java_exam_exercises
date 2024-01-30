package exams1.dicegames;

/**
 * Form
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public enum ShapeSymbol {

  CIRCLE(0), RECTANGLE(4), TRIANGLE(3);

  private final int corners;

  ShapeSymbol(int corners) {
    this.corners = corners;
  }

  public int corners() {
    return corners;
  }

}

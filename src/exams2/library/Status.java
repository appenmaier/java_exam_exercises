package exams2.library;

/**
 * Status
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public enum Status {

  AVAILABLE("verfuegbar"), LENT("verliehen");

  private String description;

  Status(String description) {
    this.description = description;
  }

  public String description() {
    return description;
  }

}

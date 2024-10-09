package exams1.classdiagrams.cashiersystem;

/**
 * Kassierer
 *
 * @author Anarchiebald
 * @version 1.0
 *
 */
public class Cashier {

  private final int id;
  private final String name;

  public Cashier(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int id() {
    return id;
  }

  public String name() {
    return name;
  }

  @Override
  public String toString() {
    return "Cashier [id=" + id + ", name=" + name + "]";
  }

}

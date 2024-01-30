package exams1.zoo;

/**
 * Vogel
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Bird extends Animal {

  public Bird(String description, double sizeInM, double weightInKG) {
    super(description, sizeInM, weightInKG);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!super.equals(obj))
      return false;
    if (getClass() != obj.getClass())
      return false;
    return true;
  }

  public void fly() {
    System.out.println("flatter, flatter");
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public String toString() {
    return "Bird [description()=" + description() + ", sizeInM()=" + sizeInM() + ", weightInKG()="
        + weightInKG() + "]";
  }

}

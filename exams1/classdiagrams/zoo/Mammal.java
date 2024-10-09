package exams1.classdiagrams.zoo;

/**
 * Saeugetier
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Mammal extends Animal {

  public Mammal(String description, double sizeInM, double weightInKG) {
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

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  public void suckle() {
    System.out.println("saug, saug");
  }

  @Override
  public String toString() {
    return "Mammal [description()=" + description() + ", sizeInM()=" + sizeInM() + ", weightInKG()="
        + weightInKG() + "]";
  }

}

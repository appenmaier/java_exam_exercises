package exams1.classdiagrams.zoo;

import java.util.Objects;

/**
 * Fisch
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Fish extends Animal {

  public String color;

  public Fish(String description, double sizeInM, double weightInKG, String color) {
    super(description, sizeInM, weightInKG);
    this.color = color;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!super.equals(obj))
      return false;
    if (getClass() != obj.getClass())
      return false;
    Fish other = (Fish) obj;
    return Objects.equals(color, other.color);
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + Objects.hash(color);
    return result;
  }

  public void swim() {
    System.out.println("schwimm, schwimm");
  }

  @Override
  public String toString() {
    return "Fish [color=" + color + ", description()=" + description() + ", sizeInM()=" + sizeInM()
        + ", weightInKG()=" + weightInKG() + "]";
  }

}

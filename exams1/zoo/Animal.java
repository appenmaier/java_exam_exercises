package exams1.zoo;

import java.util.Objects;

/**
 * Tier
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Animal {

  private final String description;
  private final double sizeInM;
  private final double weightInKG;

  public Animal(String description, double sizeInM, double weightInKG) {
    this.description = description;
    this.sizeInM = sizeInM;
    this.weightInKG = weightInKG;
  }

  public String description() {
    return description;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Animal other = (Animal) obj;
    return Objects.equals(description, other.description)
        && Double.doubleToLongBits(sizeInM) == Double.doubleToLongBits(other.sizeInM)
        && Double.doubleToLongBits(weightInKG) == Double.doubleToLongBits(other.weightInKG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, sizeInM, weightInKG);
  }

  public double sizeInM() {
    return sizeInM;
  }

  @Override
  public String toString() {
    return "Animal [description=" + description + ", sizeInM=" + sizeInM + ", weightInKG="
        + weightInKG + "]";
  }

  public double weightInKG() {
    return weightInKG;
  }

}

package exams1.parkinggarage;

/**
 * Auto
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Car extends Vehicle {

  public Car(String make, String model, double length, double height) {
    super(make, model, length, height);
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

  @Override
  public String toString() {
    return "Car [height()=" + height() + ", length()=" + length() + ", make()=" + make()
        + ", model()=" + model() + "]";
  }

}

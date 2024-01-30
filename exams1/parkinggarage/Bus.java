package exams1.parkinggarage;

/**
 * Bus
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Bus extends Vehicle {

  public Bus(String make, String model, double length, double height) {
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
    return "Bus [height()=" + height() + ", length()=" + length() + ", make()=" + make()
        + ", model()=" + model() + "]";
  }

}

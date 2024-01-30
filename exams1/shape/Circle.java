package exams1.shape;

import java.util.Objects;

/**
 * Kreis
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Circle extends Shape {

  private final double r;

  public Circle(double r) {
    this.r = r;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Circle other = (Circle) obj;
    return Double.doubleToLongBits(r) == Double.doubleToLongBits(other.r);
  }

  @Override
  public double getArea() {
    return Math.PI * r * r;
  }


  @Override
  public double getCircumference() {
    return 2 * Math.PI * r;
  }

  @Override
  public int hashCode() {
    return Objects.hash(r);
  }

  public double r() {
    return r;
  }

  @Override
  public String toString() {
    return "Circle [r=" + r + "]";
  }

}

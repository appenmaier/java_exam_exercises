package exams1.classdiagrams.shape;

import java.util.Objects;

/**
 * Rechteck
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Rectangle extends Shape {

  private final double a;
  private final double b;

  public Rectangle(double a, double b) {
    this.a = a;
    this.b = b;
  }

  public double a() {
    return a;
  }

  public double b() {
    return b;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Rectangle other = (Rectangle) obj;
    return Double.doubleToLongBits(a) == Double.doubleToLongBits(other.a)
        && Double.doubleToLongBits(b) == Double.doubleToLongBits(other.b);
  }


  @Override
  public double getArea() {
    return a * b;
  }

  @Override
  public double getCircumference() {
    return 2 * a + 2 * b;
  }

  @Override
  public int hashCode() {
    return Objects.hash(a, b);
  }

  @Override
  public String toString() {
    return "Rectangle [a=" + a + ", b=" + b + "]";
  }

}

package exams1.classdiagrams.shape;

/**
 * Quadrat
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Square extends Rectangle {

  public Square(double a) {
    super(a, a);
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
    return "Square [a()=" + a() + ", b()=" + b() + "]";
  }

}

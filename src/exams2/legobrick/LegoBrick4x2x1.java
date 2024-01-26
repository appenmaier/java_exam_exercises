package exams2.legobrick;

import java.util.Arrays;

/**
 * Lego-Baustein 4x2x1
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public final class LegoBrick4x2x1 extends LegoBrick {

  public LegoBrick4x2x1(int id, String color) {
    super(id, new int[] {4, 2, 1}, color);
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
    return "LegoBrick4x2x1 [color()=" + color() + ", getDimensions()="
        + Arrays.toString(getDimensions()) + ", id()=" + id() + "]";
  }

}

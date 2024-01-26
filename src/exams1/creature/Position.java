package exams1.creature;

import java.util.Objects;

/**
 * Position
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Position {

  private int x, y;

  public Position(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public void decreaseX() {
    x--;
  }

  public void decreaseY() {
    y--;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Position other = (Position) obj;
    return x == other.x && y == other.y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y);
  }

  public void increaseX() {
    x++;
  }

  public void increaseY() {
    y++;
  }

  @Override
  public String toString() {
    return "Position [x=" + x + ", y=" + y + "]";
  }

}

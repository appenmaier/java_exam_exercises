package exams1.creature;

import java.util.Objects;

/**
 * Kreatur
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Creature {

  private final String name;
  private final Position position;
  private final Type type;


  public Creature(String name, Type type, Position position) {
    this.name = name;
    this.type = type;
    this.position = position;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Creature other = (Creature) obj;
    return Objects.equals(name, other.name) && Objects.equals(position, other.position)
        && type == other.type;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, position, type);
  }

  public void moveDown() {
    position.decreaseY();
  }

  public void moveLeft() {
    position.decreaseY();
  }

  public void moveRight() {
    position.increaseX();
  }

  public void moveUp() {
    position.increaseY();
  }

  public String name() {
    return name;
  }

  public Position position() {
    return position;
  }

  @Override
  public String toString() {
    return "Creature [name=" + name + ", position=" + position + ", type=" + type + "]";
  }

  public Type type() {
    return type;
  }

}

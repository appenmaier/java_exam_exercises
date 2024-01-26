package exams2.legobrick;

import java.util.Objects;

/**
 * Lego
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public abstract class Lego {

  private final int id;

  public Lego(int id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Lego other = (Lego) obj;
    return id == other.id;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  public int id() {
    return id;
  }

  @Override
  public String toString() {
    return "Lego [id=" + id + "]";
  }

}

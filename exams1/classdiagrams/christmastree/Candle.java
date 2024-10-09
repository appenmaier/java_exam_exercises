package exams1.classdiagrams.christmastree;

import java.util.Objects;

/**
 * Kerze
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Candle {

  private final String colour;
  protected boolean isBurning;

  public Candle(String colour) {
    this.colour = colour;
  }

  public String colour() {
    return colour;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Candle other = (Candle) obj;
    return Objects.equals(colour, other.colour) && isBurning == other.isBurning;
  }

  @Override
  public int hashCode() {
    return Objects.hash(colour, isBurning);
  }

  public boolean isBuring() {
    return isBurning;
  }

  public void lightACandle() {
    isBurning = true;
  }

  @Override
  public String toString() {
    return "Candle [colour=" + colour + ", isBurning=" + isBurning + "]";
  }

  public void turnOffACandle() {
    isBurning = false;
  }

}

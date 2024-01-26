package exams1.cardsdealer;

import java.util.Objects;

/**
 * Spielkarte
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Card {

  private final String colour;
  private final int value;

  public Card(String colour, int value) {
    this.colour = colour;
    this.value = value;
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
    Card other = (Card) obj;
    return Objects.equals(colour, other.colour) && value == other.value;
  }

  @Override
  public int hashCode() {
    return Objects.hash(colour, value);
  }

  @Override
  public String toString() {
    return "Card [colour=" + colour + ", value=" + value + "]";
  }

  public int value() {
    return value;
  }

}

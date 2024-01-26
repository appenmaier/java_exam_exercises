package exams1.dicegames;

import java.util.Objects;
import java.util.Random;

/**
 * 6er-Wuerfel
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class ValueDice extends Dice {

  private int value;

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    ValueDice other = (ValueDice) obj;
    return value == other.value;
  }

  public int getValue() {
    return value;
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public void rollTheDice() {
    Random random = new Random();
    value = random.nextInt(6) + 1;
  }

  @Override
  public String toString() {
    return "ValueDice [value=" + value + "]";
  }

}

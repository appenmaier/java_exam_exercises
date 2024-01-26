package exams1.christmastree;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Weihnachtsbaum
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class ChristmasTree {

  private final List<Candle> candles;
  private final double size;
  private final String type;

  public ChristmasTree(String type, double size) {
    this.type = type;
    this.size = size;
    candles = new ArrayList<>();
  }

  public void addCandle(Candle candle) {
    candles.add(candle);
  }

  public List<Candle> candles() {
    return candles;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    ChristmasTree other = (ChristmasTree) obj;
    return Objects.equals(candles, other.candles)
        && Double.doubleToLongBits(size) == Double.doubleToLongBits(other.size)
        && Objects.equals(type, other.type);
  }

  public int getNumberOfElectricCandles() {
    int numberOfElectricCandles = 0;

    for (Candle c : candles) {
      if (c instanceof ElectricCandle) {
        numberOfElectricCandles++;
      }
    }

    return numberOfElectricCandles;
  }

  @Override
  public int hashCode() {
    return Objects.hash(candles, size, type);
  }

  public void lightChristmasTree() {
    for (Candle c : candles) {
      c.lightACandle();
    }
  }

  public double size() {
    return size;
  }

  @Override
  public String toString() {
    return "ChristmasTree [candles=" + candles + ", size=" + size + ", type=" + type + "]";
  }

  public String type() {
    return type;
  }

}

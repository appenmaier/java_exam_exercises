package exams1.dicegames.dicegame02;

import java.util.Random;

/**
 * Formen-Wuerfel
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Dice {

  public ShapeSymbol rollTheDice() {
    Random random = new Random();
    int randomNumber = random.nextInt(3);
    return switch (randomNumber) {
      case 0 -> ShapeSymbol.CIRCLE;
      case 1 -> ShapeSymbol.TRIANGLE;
      default -> ShapeSymbol.RECTANGLE;
    };
  }

}

package exams1.dicegames;

import java.util.Random;

/**
 * Formen-Wuerfel
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class ShapeSymbolDice extends Dice {

  private ShapeSymbol shapeSymbol;

  public ShapeSymbol getShapeSymbol() {
    return shapeSymbol;
  }

  @Override
  public void rollTheDice() {
    Random random = new Random();
    int randomNumber = random.nextInt(3);
    shapeSymbol = switch (randomNumber) {
      case 0 -> ShapeSymbol.CIRCLE;
      case 1 -> ShapeSymbol.TRIANGLE;
      default -> ShapeSymbol.RECTANGLE;
    };
  }

}

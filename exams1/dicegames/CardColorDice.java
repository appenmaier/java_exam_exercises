package exams1.dicegames;

import java.util.Random;

/**
 * Kartenfarben-Wuerfel
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class CardColorDice extends Dice {

  private CardColor cardColor;

  public CardColor getCardColor() {
    return cardColor;
  }

  @Override
  public void rollTheDice() {
    Random random = new Random();
    int randomNumber = random.nextInt(4);
    cardColor = switch (randomNumber) {
      case 0 -> CardColor.CLUBS;
      case 1 -> CardColor.DIAMONDS;
      case 2 -> CardColor.HEARTS;
      default -> CardColor.SPADE;
    };
  }

}

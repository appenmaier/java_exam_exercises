package exams1.dicegames.dicegame04;

import java.util.Random;

/**
 * Mengen-Wuerfel
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class AmountDice {

  public int rollTheDice() {
    Random random = new Random();
    int randomNumber = random.nextInt(1, 7);
    return randomNumber;
  }

}

package exams1.dicegame01;

import java.util.Random;

/**
 * Waffensymbol-Wuerfel
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class WeaponDice {

  private Weapon weapon;

  public Weapon getWeapon() {
    return weapon;
  }

  public void rollTheDice() {
    Random random = new Random();
    int randomNumber = random.nextInt(4);
    weapon = switch (randomNumber) {
      case 0 -> Weapon.SWORD;
      case 1 -> Weapon.AXE;
      case 2 -> Weapon.SPEAR;
      default -> Weapon.CLUB;
    };

  }

}

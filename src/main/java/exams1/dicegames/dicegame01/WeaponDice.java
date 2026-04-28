package exams1.dicegames.dicegame01;

import java.util.Random;

/**
 * Represents a dice that randomly selects a weapon when rolled.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class WeaponDice {

   private Weapon weapon;

   public WeaponDice() {
      rollTheDice();
   }

   /** Returns the weapon that was last rolled. */
   public Weapon getWeapon() {
      return weapon;
   }

   /** Rolls the dice and randomly assigns a new weapon. */
   public void rollTheDice() {
      Random random = new Random();
      int randomNumber = random.nextInt(4);
      weapon = switch (randomNumber) {
         case 0  -> Weapon.SWORD;
         case 1  -> Weapon.AXE;
         case 2  -> Weapon.SPEAR;
         default -> Weapon.CLUB;
      };
   }

}

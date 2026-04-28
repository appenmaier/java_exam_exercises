package exams1.dicegames.dicegame01;

/**
 * Represents a weapon that can be rolled on the weapon dice, each with a description and power value.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public enum Weapon {

   SWORD("Schwert", 4), SPEAR("Speer", 2), AXE("Axt", 3), CLUB("Keule", 1);

   private final String description;
   private final int power;

   Weapon(String description, int power) {
      this.description = description;
      this.power = power;
   }

   /** Returns the human-readable description of this weapon. */
   public String description() {
      return description;
   }

   /** Returns the attack power of this weapon. */
   public int power() {
      return power;
   }

}

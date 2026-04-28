package exams1.dicegames.dicegame10;

/**
 * Represents a combat symbol that can appear on the symbol dice.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public enum Symbol {

   SWORD("Schwert"), SHIELD("Schild");

   private final String description;

   Symbol(String description) {
      this.description = description;
   }

   /** Returns the human-readable description of this symbol. */
   public String getDescription() {
      return description;
   }

}

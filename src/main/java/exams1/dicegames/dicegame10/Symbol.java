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

   /**
    * Creates a symbol enum constant with the given description.
    *
    * @param description the human-readable name of this symbol
    */
   Symbol(String description) {
      this.description = description;
   }

   /** Returns the human-readable description of this symbol. */
   public String getDescription() {
      return description;
   }

}

package exams1.dicegames.dicegame10;

/**
 * Symbol
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

   public String getDescription() {
      return description;
   }

}

package exams1.dicegames.dicegame13;

/**
 * Weihnachts-Symbol
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public enum ChristmasSymbol {

   STAR("Stern"), TREE("Weihnachtsbaum"), CANDLE("Kerze");

   private final String description;

   ChristmasSymbol(String description) {
      this.description = description;
   }

   public String description() {
      return description;
   }

}

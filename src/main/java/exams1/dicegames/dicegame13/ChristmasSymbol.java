package exams1.dicegames.dicegame13;

/**
 * Represents a Christmas-themed symbol used in the dice game.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public enum ChristmasSymbol {

   STAR("Stern"), TREE("Weihnachtsbaum"), CANDLE("Kerze");

   private final String description;

   /**
    * Creates a Christmas symbol enum constant with the given description.
    *
    * @param description the human-readable German name of this symbol
    */
   ChristmasSymbol(String description) {
      this.description = description;
   }

   /** Returns the human-readable description of this Christmas symbol. */
   public String description() {
      return description;
   }

}

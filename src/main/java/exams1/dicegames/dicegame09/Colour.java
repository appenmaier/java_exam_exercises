package exams1.dicegames.dicegame09;

/**
 * Farbe
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public enum Colour {

   CLUBS("Kreuz", 1), SPADE("Pik", 2), HEARTS("Herz", 3), DIAMONDS("Karo", 4);

   private final String description;
   private final int priority;

   private Colour(String description, int priority) {
      this.description = description;
      this.priority = priority;
   }

   public String getDescription() {
      return description;
   }

   public int getPriority() {
      return priority;
   }

}

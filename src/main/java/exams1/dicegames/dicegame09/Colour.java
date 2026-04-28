package exams1.dicegames.dicegame09;

/**
 * Represents a card suit colour used in the dice game, each with a description and priority.
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

   /** Returns the human-readable description of this colour. */
   public String getDescription() {
      return description;
   }

   /** Returns the priority value of this colour used for comparison. */
   public int getPriority() {
      return priority;
   }

}

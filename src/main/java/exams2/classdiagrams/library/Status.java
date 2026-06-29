package exams2.classdiagrams.library;

/**
 * Represents the availability status of a book in the library.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public enum Status {

   AVAILABLE("verfuegbar"), LENT("verliehen");

   private String description;

   /**
    * Creates a status enum constant with the given German description.
    *
    * @param description the German display name of this status
    */
   Status(String description) {
      this.description = description;
   }

   /**
    * Returns the human-readable description of this status.
    */
   public String description() {
      return description;
   }

}

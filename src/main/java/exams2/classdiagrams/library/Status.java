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

package exams2.classdiagrams.library;

/**
 * Represents the supported file formats for electronic books.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public enum FileFormat {

   AZW("Amazon Kindle"), EPUB("Electronic Publication"), LRF("Portable Reader File");

   private final String description;

   /**
    * Creates a file format enum constant with the given description.
    *
    * @param description the human-readable name of this file format
    */
   FileFormat(String description) {
      this.description = description;
   }

   /**
    * Returns the human-readable description of this file format.
    */
   public String description() {
      return description;
   }

}

package exams2.classdiagrams.videocollection;

/**
 * Represents the genre of a movie in the video collection.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public enum Genre {

   SCIFI("Science-Fiction"), HORROR("Horror"), ACTION("Action"), COMEDY("Komoedie");

   private final String description;

   /**
    * Creates a genre enum constant with the given description.
    *
    * @param description the human-readable name of this genre
    */
   private Genre(String description) {
      this.description = description;
   }

   /**
    * Returns the human-readable description of this genre.
    */
   public String description() {
      return description;
   }

}

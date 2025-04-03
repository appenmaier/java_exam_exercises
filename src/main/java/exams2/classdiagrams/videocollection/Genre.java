package exams2.classdiagrams.videocollection;

/**
 * Genre
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public enum Genre {

   SCIFI("Science-Fiction"), HORROR("Horror"), ACTION("Action"), COMEDY("Komoedie");

   private final String description;

   private Genre(String description) {
      this.description = description;
   }

   public String description() {
      return description;
   }

}

package exams2.classdiagrams.dictionary;

/**
 * Represents a supported language in the dictionary system.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public enum Language {

   DE("DE", "Deutsch"), EN("EN", "Englisch"), FR("FR", "Franzoesisch");

   private final String code;
   private final String description;

   Language(String code, String description) {
      this.code = code;
      this.description = description;
   }

   /**
    * Returns the ISO language code for this language.
    */
   public String code() {
      return code;
   }

   /**
    * Returns the human-readable name of this language.
    */
   public String description() {
      return description;
   }

}

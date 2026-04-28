package exams2.classdiagrams.dictionary;

/**
 * Represents a word in a specific language, comparable by its string value.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record Word(String value, Language language) implements Comparable<Word> {

   /** Compares this word to another alphabetically by string value. */
   @Override
   public int compareTo(Word other) {
      return this.value().compareTo(other.value());
   }

}

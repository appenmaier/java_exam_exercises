package exams2.classdiagrams.dictionary;

/**
 * Wort
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record Word(String value, Language language) implements Comparable<Word> {

   @Override
   public int compareTo(Word other) {
      return this.value().compareTo(other.value());
   }

}

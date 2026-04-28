package exams2.queries.character;

/**
 * Represents a game character with a name, race, profession, level, and experience points.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record Character(String name, Race race, Profession profession, int level,
      int experiencePoints) implements Comparable<Character> {

   /** Compares characters first by level descending, then by experience points descending. */
   @Override
   public int compareTo(Character other) {
      if (this.level == other.level) {
         return Integer.compare(other.experiencePoints, this.experiencePoints);
      } else {
         return Integer.compare(other.level, this.level);
      }
   }

}

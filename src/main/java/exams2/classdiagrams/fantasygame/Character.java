package exams2.classdiagrams.fantasygame;

/**
 * Represents a playable character in the fantasy game with a race, profession, level, and experience points.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record Character(String name, Race race, Profession profession, int level,
      int experiencePoints) implements Comparable<Character> {

   /** Compares characters by level descending, then by experience points descending. */
   @Override
   public int compareTo(Character other) {
      if (this.level == other.level) {
         return Integer.compare(other.experiencePoints, this.experiencePoints);
      } else {
         return Integer.compare(other.level, this.level);
      }
   }

}

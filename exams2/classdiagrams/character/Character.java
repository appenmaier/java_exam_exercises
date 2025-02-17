package exams2.classdiagrams.character;

/**
 * Spielfigur
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record Character(String name, Race race, Profession profession, int level,
      int experiencePoints) implements Comparable<Character> {

   @Override
   public int compareTo(Character other) {
      if (this.level == other.level) {
         return Integer.compare(other.experiencePoints, this.experiencePoints);
      } else {
         return Integer.compare(other.level, this.level);
      }
   }

}

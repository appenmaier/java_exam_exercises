package exams2.classdiagrams.team;

/**
 * Sportler
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public abstract class Sportsman implements Comparable<Sportsman> {

   private final String name;

   public Sportsman(String name) {
      this.name = name;
   }

   @Override
   public int compareTo(Sportsman other) {
      return Integer.compare(other.getScorerPoints(), getScorerPoints());
   }

   public abstract int getScorerPoints();

   public String name() {
      return name;
   }

}

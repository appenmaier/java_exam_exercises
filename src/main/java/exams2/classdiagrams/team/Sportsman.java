package exams2.classdiagrams.team;

/**
 * Abstract base class representing a sportsman who can be compared by scorer points.
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

   /** Compares sportsmen by scorer points descending. */
   @Override
   public int compareTo(Sportsman other) {
      return Integer.compare(other.getScorerPoints(), getScorerPoints());
   }

   /**
    * Returns the total scorer points used for comparison and ranking.
    */
   public abstract int getScorerPoints();

   /**
    * Returns the name of this sportsman.
    */
   public String name() {
      return name;
   }

}

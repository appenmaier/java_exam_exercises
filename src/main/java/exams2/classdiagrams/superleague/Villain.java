package exams2.classdiagrams.superleague;

/**
 * Represents a villain belonging to a specific universe with a power level.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Villain extends SuperHuman {

   /**
    * Creates a villain with the given name, universe, and power level.
    *
    * @param name     the villain's name
    * @param universe the universe this villain belongs to
    * @param power    the power level of this villain
    */
   public Villain(String name, Universe universe, int power) {
      super(name, universe, power);
   }

}

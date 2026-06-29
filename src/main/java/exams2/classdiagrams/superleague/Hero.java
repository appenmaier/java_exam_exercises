package exams2.classdiagrams.superleague;

/**
 * Represents a superhero belonging to a specific universe with a power level.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Hero extends SuperHuman {

   /**
    * Creates a hero with the given name, universe, and power level.
    *
    * @param name     the hero's name
    * @param universe the universe this hero belongs to
    * @param power    the power level of this hero
    */
   public Hero(String name, Universe universe, int power) {
      super(name, universe, power);
   }

}

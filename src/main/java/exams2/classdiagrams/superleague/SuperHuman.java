package exams2.classdiagrams.superleague;

import java.util.Objects;

/**
 * Abstract base class representing a super-powered being belonging to a comic universe.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public abstract class SuperHuman {

   private final String name;
   private final Universe universe;
   private final int power;

   public SuperHuman(String name, Universe universe, int power) {
      this.name = name;
      this.universe = universe;
      this.power = power;
   }

   /**
    * Returns the name of this super-powered being.
    */
   public String name() {
      return name;
   }

   /**
    * Returns the power level of this super-powered being.
    */
   public int power() {
      return power;
   }

   /**
    * Returns the universe this super-powered being belongs to.
    */
   public Universe universe() {
      return universe;
   }

   @Override
   public int hashCode() {
      return Objects.hash(name, power, universe);
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }
      if (obj == null) {
         return false;
      }
      if (getClass() != obj.getClass()) {
         return false;
      }
      SuperHuman other = (SuperHuman) obj;
      return Objects.equals(name, other.name) && power == other.power && universe == other.universe;
   }

   @Override
   public String toString() {
      return "SuperHuman [name=" + name + ", universe=" + universe + ", power=" + power + "]";
   }

}

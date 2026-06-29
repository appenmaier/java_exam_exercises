package exams1.classdiagrams.easterbasket;

import java.util.Objects;

/**
 * A material used in a confectionery egg, with a weight per unit.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
class Material {

   private final String name;
   private final double weightPerUnitInG;

   /**
    * Creates a material with the given name and weight per unit.
    *
    * @param name             the name of the material
    * @param weightPerUnitInG the weight of one unit in grams
    */
   public Material(String name, double weightPerUnitInG) {
      this.name = name;
      this.weightPerUnitInG = weightPerUnitInG;
   }

   /**
    * Returns the name of the material.
    *
    * @return the material name
    */
   public String getName() {
      return name;
   }

   /**
    * Returns the weight of one unit of this material in grams.
    *
    * @return weight per unit in grams
    */
   public double getWeightPerUnitInG() {
      return weightPerUnitInG;
   }

   @Override
   public int hashCode() {
      return Objects.hash(name, weightPerUnitInG);
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
      Material other = (Material) obj;
      return Objects.equals(name, other.name) && Double.doubleToLongBits(weightPerUnitInG) == Double
            .doubleToLongBits(other.weightPerUnitInG);
   }

   @Override
   public String toString() {
      return "Material [name=" + name + ", weightPerUnitInG=" + weightPerUnitInG + "]";
   }

}

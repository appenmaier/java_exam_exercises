package exams1.classdiagrams.easterbasket;

import java.util.Objects;

/**
 * A confectionery egg made of a shell and a filling material.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
class ConfectioneryEgg extends Egg {

   private Material shellMaterial;
   private int shellMaterialUnits;
   private Material fillingMaterial;
   private int fillingMaterialUnits;

   /**
    * Creates a confectionery egg with the given color.
    *
    * @param color the color of the egg
    */
   public ConfectioneryEgg(String color) {
      super(color);
   }

   /**
    * Sets the filling material and number of units used.
    *
    * @param material the filling material
    * @param units    the number of material units
    */
   public void setFilling(Material material, int units) {
      this.fillingMaterial = material;
      this.fillingMaterialUnits = units;
   }

   /**
    * Sets the shell material and number of units used.
    *
    * @param material the shell material
    * @param units    the number of material units
    */
   public void setShell(Material material, int units) {
      this.shellMaterial = material;
      this.shellMaterialUnits = units;
   }

   /**
    * Returns the total weight calculated from shell and filling materials.
    *
    * @return weight in grams
    */
   @Override
   public double getWeightInG() {
      double weight = shellMaterial.getWeightPerUnitInG() * shellMaterialUnits
            + fillingMaterial.getWeightPerUnitInG() * fillingMaterialUnits;
      return weight;
   }

   /**
    * Returns the shell material.
    *
    * @return the shell material
    */
   public Material getShellMaterial() {
      return shellMaterial;
   }

   /**
    * Returns the number of shell material units.
    *
    * @return number of shell units
    */
   public int getShellMaterialUnits() {
      return shellMaterialUnits;
   }

   /**
    * Returns the filling material.
    *
    * @return the filling material
    */
   public Material getFillingMaterial() {
      return fillingMaterial;
   }

   /**
    * Returns the number of filling material units.
    *
    * @return number of filling units
    */
   public int getFillingMaterialUnits() {
      return fillingMaterialUnits;
   }

   @Override
   public int hashCode() {
      return Objects.hash(fillingMaterial, fillingMaterialUnits, shellMaterial, shellMaterialUnits);
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
      ConfectioneryEgg other = (ConfectioneryEgg) obj;
      return Objects.equals(fillingMaterial, other.fillingMaterial)
            && fillingMaterialUnits == other.fillingMaterialUnits
            && Objects.equals(shellMaterial, other.shellMaterial)
            && shellMaterialUnits == other.shellMaterialUnits;
   }

   @Override
   public String toString() {
      return "ConfectioneryEgg [shellMaterial=" + shellMaterial + ", shellMaterialUnits="
            + shellMaterialUnits + ", fillingMaterial=" + fillingMaterial
            + ", fillingMaterialUnits=" + fillingMaterialUnits + "]";
   }

}

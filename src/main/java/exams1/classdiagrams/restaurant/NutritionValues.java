package exams1.classdiagrams.restaurant;

import java.util.Objects;

/**
 * Nutritional information for a dish, expressed in grams per serving.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
class NutritionValues {

   private final double carbohydratesInG;
   private final double fatsInG;
   private final double proteinsInG;

   /**
    * Creates nutrition values for a dish.
    *
    * @param carbohydratesInG carbohydrates in grams
    * @param fatsInG          fats in grams
    * @param proteinsInG      proteins in grams
    */
   public NutritionValues(double carbohydratesInG, double fatsInG, double proteinsInG) {
      this.carbohydratesInG = carbohydratesInG;
      this.fatsInG = fatsInG;
      this.proteinsInG = proteinsInG;
   } // 2

   /**
    * Returns the carbohydrate content in grams.
    *
    * @return carbohydrates in grams
    */
   public double getCarbohydratesInG() {
      return carbohydratesInG;
   }

   /**
    * Returns the fat content in grams.
    *
    * @return fats in grams
    */
   public double getFatsInG() {
      return fatsInG;
   }

   /**
    * Returns the protein content in grams.
    *
    * @return proteins in grams
    */
   public double getProteinsInG() {
      return proteinsInG;
   }

   @Override
   public int hashCode() {
      return Objects.hash(carbohydratesInG, fatsInG, proteinsInG);
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
      NutritionValues other = (NutritionValues) obj;
      return Double.doubleToLongBits(carbohydratesInG) == Double
            .doubleToLongBits(other.carbohydratesInG)
            && Double.doubleToLongBits(fatsInG) == Double.doubleToLongBits(other.fatsInG)
            && Double.doubleToLongBits(proteinsInG) == Double.doubleToLongBits(other.proteinsInG);
   }

   @Override
   public String toString() {
      return "NutritionValues [carbohydratesInG=" + carbohydratesInG + ", fatsInG=" + fatsInG
            + ", proteinsInG=" + proteinsInG + "]";
   }

}

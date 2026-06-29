package exams2.queries.terminators;

/**
 * Terminator series with its description, humanoid status, and weight.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public enum Series {

   /** First series: non-humanoid, 2000 kg. */
   T1("1 series", false, 2000),
   /** 800 series: humanoid, 500 kg. */
   T800("800 series", true, 500),
   /** 1000 series: humanoid, 100 kg. */
   T1000("1000 series", true, 100);

   private final String description;
   private final boolean isHumanoid;
   private final double weightInKg;

   private Series(String description, boolean isHumanoid, double weightInKg) {
      this.description = description;
      this.isHumanoid = isHumanoid;
      this.weightInKg = weightInKg;
   }

   /**
    * Returns a human-readable description of this series.
    *
    * @return series description
    */
   public String getDescription() {
      return description;
   }

   /**
    * Returns whether robots of this series have a humanoid form.
    *
    * @return {@code true} if humanoid
    */
   public boolean isHumanoid() {
      return isHumanoid;
   }

   /**
    * Returns the weight of a robot of this series in kilograms.
    *
    * @return weight in kg
    */
   public double getWeightInKg() {
      return weightInKg;
   }

}

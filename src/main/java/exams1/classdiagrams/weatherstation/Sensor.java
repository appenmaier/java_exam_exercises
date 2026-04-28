package exams1.classdiagrams.weatherstation;

/**
 * Represents the type of sensor used in a weather station measurement.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public enum Sensor {

   TEMPERATURE("Temperatur", "°C"), AIRPRESSURE("Luftdruck", "hPA"), PRECIPITATION("Niederschlag",
         "mm"), HUMIDITY("Luftfeuchtigkeit", "%");

   private final String description;
   private final String unitOfMeasure;

   private Sensor(String description, String unitOfMeasure) {
      this.description = description;
      this.unitOfMeasure = unitOfMeasure;
   }

   /** Returns the human-readable description of this sensor type. */
   public String getDescription() {
      return description;
   }

   /** Returns the unit of measure used by this sensor type. */
   public String getUnitOfMeasure() {
      return unitOfMeasure;
   }

}

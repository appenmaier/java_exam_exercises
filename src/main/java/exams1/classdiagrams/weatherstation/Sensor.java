package exams1.classdiagrams.weatherstation;

/**
 * Sensor
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

   public String getDescription() {
      return description;
   }

   public String getUnitOfMeasure() {
      return unitOfMeasure;
   }

}

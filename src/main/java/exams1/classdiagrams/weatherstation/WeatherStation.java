package exams1.classdiagrams.weatherstation;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents a weather station at a specific location that collects measurement values from sensors.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class WeatherStation {

   private static int counter;
   private final int id;
   private final String location;
   private final List<MeasurementValue> measurementValues;

   public WeatherStation(String location) {
      counter++;
      id = counter;
      this.location = location;
      measurementValues = new ArrayList<>();
   }

   /** Adds a measurement value to this weather station's collection. */
   public void addMeasurementValue(MeasurementValue measurementValue) {
      measurementValues.add(measurementValue);
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
      WeatherStation other = (WeatherStation) obj;
      return id == other.id && Objects.equals(location, other.location)
            && Objects.equals(measurementValues, other.measurementValues);
   }

   /** Returns the average measurement value for the given sensor within the specified time range. */
   public double getAverageValueBySensor(Sensor sensor, long start, long end) {
      double total = 0;
      int counter = 0;
      for (MeasurementValue v : measurementValues) {
         if (v.getSensor().equals(sensor) && v.getTimestamp() >= start && v.getTimestamp() <= end) {
            total += v.getValue();
            counter++;
         }
      }
      return total / counter;
   }

   /** Returns the unique identifier of this weather station. */
   public int getId() {
      return id;
   }

   /** Returns the location of this weather station. */
   public String getLocation() {
      return location;
   }

   /** Returns all measurement values recorded by this weather station. */
   public List<MeasurementValue> getMeasurementValues() {
      return measurementValues;
   }

   @Override
   public int hashCode() {
      return Objects.hash(id, location, measurementValues);
   }

   @Override
   public String toString() {
      return "WeatherStation [id=" + id + ", location=" + location + ", measurementValues="
            + measurementValues + "]";
   }

}

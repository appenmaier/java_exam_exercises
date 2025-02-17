package exams1.classdiagrams.weatherstation;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Wetterstation
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

   public int getId() {
      return id;
   }

   public String getLocation() {
      return location;
   }

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

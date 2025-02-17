package exams1.classdiagrams.weatherstation;

import java.util.Objects;

/**
 * Messwert
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class MeasurementValue {

   private final long timestamp;
   private final Sensor sensor;
   private final double value;

   public MeasurementValue(long timestamp, Sensor sensor, double value) {
      this.timestamp = timestamp;
      this.sensor = sensor;
      this.value = value;
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
      MeasurementValue other = (MeasurementValue) obj;
      return sensor == other.sensor && timestamp == other.timestamp
            && Double.doubleToLongBits(value) == Double.doubleToLongBits(other.value);
   }

   public Sensor getSensor() {
      return sensor;
   }

   public long getTimestamp() {
      return timestamp;
   }

   public double getValue() {
      return value;
   }

   @Override
   public int hashCode() {
      return Objects.hash(sensor, timestamp, value);
   }

   @Override
   public String toString() {
      return "MeasurementValue [timestamp=" + timestamp + ", sensor=" + sensor + ", value=" + value
            + "]";
   }

}

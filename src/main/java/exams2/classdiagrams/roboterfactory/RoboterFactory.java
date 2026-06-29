package exams2.classdiagrams.roboterfactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

/**
 * A generic factory that manages a map of robots keyed by serial number.
 *
 * @param <T> the type of robot produced by this factory
 * @author Daniel Appenmaier
 * @version 1.0
 */
public record RoboterFactory<T extends Roboter>(Map<String, T> roboters) {

   /**
    * Finds a robot by its serial number.
    *
    * @param serialNumber the serial number to look up
    * @return an {@link Optional} containing the robot, or empty if not found
    */
   public Optional<T> getRoboterBySerialNumber(String serialNumber) {
      for (Entry<String, T> e : roboters.entrySet()) {
         if (e.getKey().equals(serialNumber)) {
            return Optional.of(e.getValue());
         }
      }
      return Optional.empty();
   }

   /**
    * Returns all robots manufactured in the given year.
    *
    * @param fabricationYear the year to filter by
    * @return list of robots fabricated in that year
    */
   public List<T> getRobotersByFabricationYear(int fabricationYear) {
      List<T> robotersByFabricationYear = new ArrayList<>();
      for (T t : roboters.values()) {
         if (t.getFabricationDate().getYear() == fabricationYear) {
            robotersByFabricationYear.add(t);
         }
      }
      return robotersByFabricationYear;
   }

}

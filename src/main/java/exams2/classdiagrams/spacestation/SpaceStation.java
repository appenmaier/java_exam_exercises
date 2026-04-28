package exams2.classdiagrams.spacestation;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

/**
 * Represents a space station with a set of numbered landing bays for space fighters.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record SpaceStation(String name, Map<Integer, SpaceFighter> bays) {

   /**
    * Docks the given space fighter at the specified bay number, throwing exceptions if the bay or the fighter is already occupied.
    */
   public void land(SpaceFighter spaceFighter, Integer bayNumber)
         throws SpaceFighterAlreadyLandedException, BayAlreadyLoadedException {
      for (Entry<Integer, SpaceFighter> entry : bays.entrySet()) {
         if (entry.getKey().equals(bayNumber) && entry.getValue() != null) {
            throw new BayAlreadyLoadedException();
         }
         if (entry.getValue() != null && entry.getValue().equals(spaceFighter)) {
            throw new SpaceFighterAlreadyLandedException();
         }
      }
      bays.put(bayNumber, spaceFighter);
   }

   /**
    * Returns the docked space fighter with the highest maximum speed, if any.
    */
   public Optional<SpaceFighter> getFastestSpaceFighter() {
      SpaceFighter fastestSpaceFighter = null;
      int maxSpeed = 0;
      for (SpaceFighter s : bays.values()) {
         if (s != null && s.type().maxSpeed() > maxSpeed) {
            maxSpeed = s.type().maxSpeed();
            fastestSpaceFighter = s;
         }
      }
      return Optional.ofNullable(fastestSpaceFighter);
   }

}

package exams2.spacestation;

import java.util.Map;
import java.util.Map.Entry;

/**
 * Raumstation
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record SpaceStation(String name, Map<Integer, SpaceFighter> bays) {

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

  public SpaceFighter getFastestSpaceFighter() {
    SpaceFighter fastestSpaceFighter = null;
    int maxSpeed = 0;
    for (SpaceFighter s : bays.values()) {
      if (s != null && s.type().maxSpeed() > maxSpeed) {
        maxSpeed = s.type().maxSpeed();
        fastestSpaceFighter = s;
      }
    }
    return fastestSpaceFighter;
  }

}

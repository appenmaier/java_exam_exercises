package exams2.classdiagrams.superleague;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

/**
 * Represents a league of super-powered beings belonging to a specific universe.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 * @param <T>
 */
public record SuperLeague<T extends SuperHuman>(String name, Universe universe,
      Map<T, Boolean> members) {

   /**
    * Returns the most powerful member of this league, if any.
    */
   public Optional<T> getMostPowerfulSuperHuman() {
      T mostPowerfulSuperHuman = null;
      int power = 0;
      for (T t : members.keySet()) {
         if (t.power() > power) {
            power = t.power();
            mostPowerfulSuperHuman = t;
         }
      }
      return Optional.ofNullable(mostPowerfulSuperHuman);
   }

   /**
    * Adds the given super-powered being to the league, throwing an exception if their universe does not match.
    */
   public void addSuperHuman(T t) throws WrongUniverseException {
      if (!t.universe().equals(universe)) {
         throw new WrongUniverseException();
      }
      members.put(t, true);
   }

   /**
    * Returns all currently available (active) members of this league.
    */
   public List<T> getAllAvailableSuperHumans() {
      List<T> allAvailableSuperHumans = new ArrayList<>();
      for (Entry<T, Boolean> entry : members.entrySet()) {
         if (entry.getValue()) {
            allAvailableSuperHumans.add(entry.getKey());
         }
      }
      return allAvailableSuperHumans;
   }

}

package exams2.classdiagrams.superleague;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

/**
 * Uebermenschen-Liga
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 * @param <T>
 */
public record SuperLeague<T extends SuperHuman>(String name, Universe universe,
      Map<T, Boolean> members) {

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

   public void addSuperHuman(T t) throws WrongUniverseException {
      if (!t.universe().equals(universe)) {
         throw new WrongUniverseException();
      }
      members.put(t, true);
   }

   public List<T> getAllAvailableSuperHumans() {
      List<T> allAvailableSuperHumans = new ArrayList<>();
      for (Entry<T, Boolean> entry : members.entrySet()) {
         if (entry.getValue().equals(true)) {
            allAvailableSuperHumans.add(entry.getKey());
         }
      }
      return allAvailableSuperHumans;
   }

}

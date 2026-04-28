package exams2.queries.tanks;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

/**
 * Provides stream-based query operations over a list of tanks.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record TankQueries(List<Tank> tanks) {

   /** Prints all tanks weighing more than 25 tons, grouped by their type. */
   public void printAllTanksWithWeightBT25TonsByType() {
      Map<Type, List<Tank>> filteredTanks = tanks.stream()
            .filter(t -> t.weightInTons() > 25)
            .collect(Collectors.groupingBy(Tank::type));

      filteredTanks.forEach((t, ts) -> System.out.println(t + ": " + ts));
   }

   /** Returns the average horsepower across all tanks. */
   public OptionalDouble getAveragePerformanceInHorsePower() {
      OptionalDouble averagePerformance =
            tanks.stream().mapToInt(Tank::performanceInHorsePower).average();

      return averagePerformance;
   }

   /** Returns a distinct list of all nations represented in the tank collection. */
   public List<Nation> getAllNations() {
      List<Nation> nations = tanks.stream().map(Tank::nation).distinct().toList();

      return nations;
   }

   /** Returns whether all battle tanks have a maximum speed of at least 50 km/h. */
   public boolean isAllTanksMaxSpeedBE50KMH() {
      boolean exists = tanks.stream()
            .filter(t -> t.type().equals(Type.BATTLE_TANK))
            .allMatch(t -> t.maxSpeedInKMH() >= 50);

      return exists;
   }

   /** Prints the name of the longest tank produced by Germany, or "null" if none exists. */
   public void printLongestTankFromGermany() {
      Optional<Tank> longestTank = tanks.stream()
            .filter(t -> t.nation().equals(Nation.GER))
            .max((t1, t2) -> Double.valueOf(t1.lengthInMeters()).compareTo(t2.lengthInMeters()));

      longestTank.ifPresentOrElse(t -> System.out.println(t.name()),
            () -> System.out.println("null"));
   }

}

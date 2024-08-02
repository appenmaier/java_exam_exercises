package exams2.tank;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

/**
 * TankQueries
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record TankQueries(List<Tank> tanks) {

  public void printAllTanksWithWeightBT25TonsByType() {
    Map<Type, List<Tank>> filteredTanks = tanks.stream()
        .filter(t -> t.weightInTons() > 25)
        .collect(Collectors.groupingBy(Tank::type));

    filteredTanks.forEach((t, ts) -> System.out.println(t + ": " + ts));
  }

  public OptionalDouble getAveragePerformanceInHorsePower() {
    OptionalDouble averagePerformance =
        tanks.stream().mapToInt(Tank::performanceInHorsePower).average();

    return averagePerformance;
  }

  public List<Nation> getAllNations() {
    List<Nation> nations = tanks.stream().map(Tank::nation).distinct().toList();

    return nations;
  }

  public boolean isAllTanksMaxSpeedBE50KMH() {
    boolean exists = tanks.stream()
        .filter(t -> t.type().equals(Type.BATTLE_TANK))
        .allMatch(t -> t.maxSpeedInKMH() >= 50);

    return exists;
  }

  public void printLongestTankFromGermany() {
    Optional<Tank> longestTank = tanks.stream()
        .filter(t -> t.nation().equals(Nation.GER))
        .max((t1, t2) -> Double.valueOf(t1.lengthInMeters()).compareTo(t2.lengthInMeters()));

    longestTank.ifPresentOrElse(t -> System.out.println(t.name()),
        () -> System.out.println("null"));
  }

}

package exams2.queries.terminators;

import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import exams2.classdiagrams.roboterfactory.Terminator;

/**
 * Stream-based queries over a list of terminators.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public record TerminatorQueries(List<Terminator> terminators) {

   /**
    * Returns a distinct list of series descriptions across all terminators.
    *
    * @return list of unique series description strings
    */
   public List<String> getAllUniqueSeriesDescriptions() {
      List<String> series;
      series = terminators.stream().map(t -> t.getSeries().getDescription()).distinct().toList();
      return series;
   }

   /**
    * Returns all humanoid terminators sorted by fabrication date in descending order.
    *
    * @return list of humanoid terminators, newest first
    */
   public List<Terminator> getAllHumanoidTerminatorsSortedByFabricationDate() {
      List<Terminator> sortedT1000Terminators;
      sortedT1000Terminators = terminators.stream()
            .filter(t -> t.getSeries().isHumanoid())
            .sorted((t1, t2) -> t2.getFabricationDate().compareTo(t1.getFabricationDate()))
            .toList();
      return sortedT1000Terminators;
   }

   /**
    * Returns the average series weight in kilograms across all terminators.
    *
    * @return average weight in kg
    * @throws Exception if the terminator list is empty
    */
   public double getAverageWeigthInKg() throws Exception {
      OptionalDouble averageWeightInKg;
      averageWeightInKg =
            terminators.stream().mapToDouble(t -> t.getSeries().getWeightInKg()).average();
      if (averageWeightInKg.isEmpty()) {
         throw new Exception();
      }
      return averageWeightInKg.getAsDouble();
   }

   /**
    * Returns terminators grouped by their series weight in kilograms.
    *
    * @return map from weight in kg to the list of terminators with that weight
    */
   public Map<Double, List<Terminator>> getTerminatorsByWeightInKg() {
      Map<Double, List<Terminator>> terminatorsByWeightInKg;
      terminatorsByWeightInKg =
            terminators.stream().collect(Collectors.groupingBy(t -> t.getSeries().getWeightInKg()));
      return terminatorsByWeightInKg;
   }

}

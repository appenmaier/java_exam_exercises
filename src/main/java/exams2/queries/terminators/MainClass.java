package exams2.queries.terminators;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Entry point for the terminators query exercise.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class MainClass {

   /**
    * Demonstrates querying a list of terminators using stream-based operations.
    *
    * @param args command-line arguments (not used)
    * @throws Exception if the terminator list is empty when computing the average weight
    */
   public static void main(String[] args) throws Exception {
      List<Terminator> terminators = new ArrayList<Terminator>();

      terminators.add(new Terminator("1000-1", LocalDate.parse("2032-07-12"), Series.T1000));
      terminators.add(new Terminator("1000-2", LocalDate.parse("2032-07-13"), Series.T1000));
      terminators.add(new Terminator("800-1", LocalDate.parse("2029-03-24"), Series.T800));
      terminators.add(new Terminator("800-2", LocalDate.parse("2030-06-06"), Series.T800));
      terminators.add(new Terminator("800-3", LocalDate.parse("2030-12-06"), Series.T800));

      TerminatorQueries queries = new TerminatorQueries(terminators);

      System.out.println(queries.getAllHumanoidTerminatorsSortedByFabricationDate());
      System.out.println(queries.getAverageWeigthInKg());
      System.out.println(queries.getTerminatorsByWeightInKg());
   }

}

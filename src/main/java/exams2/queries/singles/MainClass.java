package exams2.queries.singles;

/**
 * MainClass
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class MainClass {

   public static void main(String[] args) {
      SingleQueries queries = new SingleQueries(Singles.getSingles());

      queries.printAllSinglesWithMoreThan25MillionSalesPerCountry();
      System.out.println();
      queries.printAverageBirthYearOfAllDeceasedArtists();
      System.out.println();
      System.out.println(queries.isAnySingleFromChinaWithMoreThan10MillionSales());
      System.out.println();
      System.out.println(queries.getAllSinglesFromEdSheeran());
   }

}

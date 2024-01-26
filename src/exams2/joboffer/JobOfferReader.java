package exams2.joboffer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * JobOfferReader
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class JobOfferReader {

  public static List<JobOffer> getJobOffers(File file) throws FileNotFoundException {
    List<JobOffer> jobOffers = new ArrayList<>();
    Scanner scanner = new Scanner(file);
    while (scanner.hasNextLine()) {
      String line = scanner.nextLine();
      String[] tokens = line.split(";");
      int id = Integer.valueOf(tokens[0]);
      String title = tokens[1];
      JobOffer jobOffer = new JobOffer(id, title, null);
      jobOffers.add(jobOffer);
    }
    scanner.close();
    return jobOffers;
  }

}

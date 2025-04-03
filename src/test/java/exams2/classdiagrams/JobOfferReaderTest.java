package exams2.classdiagrams;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.File;
import java.io.FileNotFoundException;

import org.junit.jupiter.api.Test;

import exams2.classdiagrams.joboffer.JobOfferReader;

/**
 * JobOfferReaderTest
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class JobOfferReaderTest {

   @Test
   void testGetJobOffers() throws FileNotFoundException {
      assertThrows(FileNotFoundException.class, () -> JobOfferReader.getJobOffers(new File("")));

      File file = new File("src/test/resources/joboffers.txt");
      assertEquals(285, JobOfferReader.getJobOffers(file).get(0).id());
      assertEquals(392, JobOfferReader.getJobOffers(file).get(1).id());
      assertEquals(430, JobOfferReader.getJobOffers(file).get(2).id());
   }

}

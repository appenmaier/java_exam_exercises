package exams1.activitydiagrams.timestampconverter;

import java.time.LocalDate;

/**
 * MainClass
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class MainClass {

   public static void main(String[] args) {
      long nowAsTimeStamp = System.currentTimeMillis();
      LocalDate nowAsDate = TimestampConverter.convert(nowAsTimeStamp);
      System.out.println(nowAsDate);

      System.out.println();
   }

}

package exams1.classdiagrams.weatherstation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * MeasurementValueHelper
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class MeasurementValueHelper {

   public static List<MeasurementValue> getValues(File file) throws FileNotFoundException {
      List<MeasurementValue> values = new ArrayList<>();

      Scanner scanner = new Scanner(file);
      while (scanner.hasNextLine()) {
         String line = scanner.nextLine();
         String[] tokens = line.split(";");

         long timestamp = Long.valueOf(tokens[0]);
         double value = Double.valueOf(tokens[1]);
         Sensor sensor = Sensor.valueOf(tokens[2]);

         MeasurementValue measurementValue = new MeasurementValue(timestamp, sensor, value);
         values.add(measurementValue);
      }
      scanner.close();

      return values;
   }

}

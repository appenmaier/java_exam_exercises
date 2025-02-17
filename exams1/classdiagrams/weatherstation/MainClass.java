package exams1.classdiagrams.weatherstation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

/**
 * MainClass
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class MainClass {

   public static void main(String[] args) throws FileNotFoundException {
      WeatherStation weatherStation = new WeatherStation("Ravensburg");
      List<MeasurementValue> values = MeasurementValueHelper
            .getValues(new File("exams1/classdiagrams/weatherstation/values.txt"));
      for (MeasurementValue v : values) {
         weatherStation.addMeasurementValue(v);
      }
      long start = 1732665600000L;
      long end = 1732752000000L;
      System.out.println("Durchschnittstemperatur in °C: "
            + weatherStation.getAverageValueBySensor(Sensor.TEMPERATURE, start, end));
   }

}

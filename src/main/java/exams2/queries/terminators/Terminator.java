package exams2.queries.terminators;

import java.time.LocalDate;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * A Terminator robot belonging to a specific series. Terminators are ordered by descending weight.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Terminator extends Roboter implements Comparable<Terminator> {

   private final Series series;

   /**
    * Creates a Terminator with the given serial number, fabrication date, and series.
    *
    * @param serialNumber    the unique serial number
    * @param fabricationDate the date of manufacture
    * @param series          the Terminator series
    */
   public Terminator(String serialNumber, LocalDate fabricationDate, Series series) {
      super(serialNumber, fabricationDate);
      this.series = series;
   }

   /**
    * Compares this Terminator to another by series weight in descending order (heaviest first).
    *
    * @param other the other Terminator to compare to
    * @return negative if this is heavier, positive if lighter, zero if equal
    */
   @Override
   public int compareTo(Terminator other) {
      return Double.compare(other.series.getWeightInKg(), series.getWeightInKg());
   }

}

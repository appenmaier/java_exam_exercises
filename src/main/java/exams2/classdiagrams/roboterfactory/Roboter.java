package exams2.classdiagrams.roboterfactory;

import java.time.LocalDate;

import lombok.Data;

/**
 * Abstract base class for a robot produced by the factory.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
@Data
public abstract class Roboter {

   /** Unique serial number of this robot. */
   private final String serialNumber;
   /** Date on which this robot was manufactured. */
   private final LocalDate fabricationDate;

}

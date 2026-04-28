package exams2.classdiagrams.shop;

/**
 * Thrown when a rating value outside the allowed range of 1 to 5 is provided.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
@SuppressWarnings("serial")
public class InvalidRatingException extends Exception {

   public InvalidRatingException(int rating) {
      super(rating + " is not a valid rating. Ratings must be in range 1 to 5");
   }

}

package exams2.classdiagrams.shop;

/**
 * InvalidRatingException
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

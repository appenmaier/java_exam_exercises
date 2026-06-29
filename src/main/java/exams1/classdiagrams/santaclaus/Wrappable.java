package exams1.classdiagrams.santaclaus;

/**
 * Represents an object that can be wrapped, unwrapped, and described.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public interface Wrappable {

   /** Returns a human-readable description of this wrappable object. */
   String getDescription();

   /** Unwraps this object. */
   void unwrap();

   /** Wraps this object. */
   void wrap();

}

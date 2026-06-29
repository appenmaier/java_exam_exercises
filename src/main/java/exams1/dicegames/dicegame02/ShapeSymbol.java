package exams1.dicegames.dicegame02;

/**
 * Represents a geometric shape symbol with a number of corners.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public enum ShapeSymbol {

   CIRCLE(0), RECTANGLE(4), TRIANGLE(3);

   private final int corners;

   /**
    * Creates a shape symbol enum constant with the given number of corners.
    *
    * @param corners the number of corners for this shape
    */
   ShapeSymbol(int corners) {
      this.corners = corners;
   }

   /** Returns the number of corners of this shape symbol. */
   public int corners() {
      return corners;
   }

}

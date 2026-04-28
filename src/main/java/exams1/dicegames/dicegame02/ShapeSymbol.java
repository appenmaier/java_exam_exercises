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

   ShapeSymbol(int corners) {
      this.corners = corners;
   }

   /** Returns the number of corners of this shape symbol. */
   public int corners() {
      return corners;
   }

}

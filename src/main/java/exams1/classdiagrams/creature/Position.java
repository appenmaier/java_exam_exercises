package exams1.classdiagrams.creature;

import java.util.Objects;

/**
 * Represents a mutable 2D position defined by x and y coordinates.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Position {

   private int x, y;

   public Position(int x, int y) {
      this.x = x;
      this.y = y;
   }

   /** Decrements the x coordinate by one. */
   public void decreaseX() {
      x--;
   }

   /** Decrements the y coordinate by one. */
   public void decreaseY() {
      y--;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }
      if (obj == null) {
         return false;
      }
      if (getClass() != obj.getClass()) {
         return false;
      }
      Position other = (Position) obj;
      return x == other.x && y == other.y;
   }

   /** Returns the x coordinate of this position. */
   public int getX() {
      return x;
   }

   /** Returns the y coordinate of this position. */
   public int getY() {
      return y;
   }

   @Override
   public int hashCode() {
      return Objects.hash(x, y);
   }

   /** Increments the x coordinate by one. */
   public void increaseX() {
      x++;
   }

   /** Increments the y coordinate by one. */
   public void increaseY() {
      y++;
   }

   @Override
   public String toString() {
      return "Position [x=" + x + ", y=" + y + "]";
   }

}

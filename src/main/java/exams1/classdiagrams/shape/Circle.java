package exams1.classdiagrams.shape;

import java.util.Objects;

/**
 * Represents a circle defined by its radius.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Circle extends Shape {

   private final double r;

   public Circle(double r) {
      this.r = r;
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
      Circle other = (Circle) obj;
      return Double.doubleToLongBits(r) == Double.doubleToLongBits(other.r);
   }

   /** Returns the area of this circle. */
   @Override
   public double getArea() {
      return Math.PI * r * r;
   }

   /** Returns the circumference of this circle. */
   @Override
   public double getCircumference() {
      return 2 * Math.PI * r;
   }

   @Override
   public int hashCode() {
      return Objects.hash(r);
   }

   /** Returns the radius of this circle. */
   public double r() {
      return r;
   }

   @Override
   public String toString() {
      return "Circle [r=" + r + "]";
   }

}

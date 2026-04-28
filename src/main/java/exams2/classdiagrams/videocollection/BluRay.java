package exams2.classdiagrams.videocollection;

import java.util.Objects;

/**
 * Represents a Blu-ray disc that stores a movie with a given storage capacity.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class BluRay extends Video {

   private final double capacity;

   public BluRay(Movie movie, double capacity) {
      super(movie);
      this.capacity = capacity;
   }

   /**
    * Returns the storage capacity of this Blu-ray disc in gigabytes.
    */
   public double capacity() {
      return capacity;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }
      if (!super.equals(obj)) {
         return false;
      }
      if (getClass() != obj.getClass()) {
         return false;
      }
      BluRay other = (BluRay) obj;
      return Double.doubleToLongBits(capacity) == Double.doubleToLongBits(other.capacity);
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = super.hashCode();
      result = prime * result + Objects.hash(capacity);
      return result;
   }

   @Override
   public String toString() {
      return "BluRay [capacity=" + capacity + ", movie()=" + movie() + "]";
   }

}

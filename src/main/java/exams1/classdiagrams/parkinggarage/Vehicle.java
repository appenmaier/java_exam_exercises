package exams1.classdiagrams.parkinggarage;

import java.util.Objects;

/**
 * Represents a vehicle with a make, model, length, and height.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Vehicle {

   private final double height;
   private final double length;
   private final String make;
   private final String model;

   public Vehicle(String make, String model, double length, double height) {
      this.make = make;
      this.model = model;
      this.length = length;
      this.height = height;
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
      Vehicle other = (Vehicle) obj;
      return height == other.height && length == other.length && Objects.equals(make, other.make)
            && Objects.equals(model, other.model);
   }

   @Override
   public int hashCode() {
      return Objects.hash(height, length, make, model);
   }

   /** Returns the height of this vehicle. */
   public double height() {
      return height;
   }

   /** Returns the length of this vehicle. */
   public double length() {
      return length;
   }

   /** Returns the make (manufacturer) of this vehicle. */
   public String make() {
      return make;
   }

   /** Returns the model name of this vehicle. */
   public String model() {
      return model;
   }

   @Override
   public String toString() {
      return "Vehicle [height=" + height + ", length=" + length + ", make=" + make + ", model="
            + model + "]";
   }

}

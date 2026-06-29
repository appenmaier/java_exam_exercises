package exams1.classdiagrams.parkinggarage;

/**
 * Represents a car as a specific type of vehicle.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Car extends Vehicle {

   /**
    * Creates a new car with the given make, model, length, and height.
    *
    * @param make   the manufacturer of the car
    * @param model  the model name of the car
    * @param length the length of the car in metres
    * @param height the height of the car in metres
    */
   public Car(String make, String model, double length, double height) {
      super(make, model, length, height);
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
      return true;
   }

   @Override
   public int hashCode() {
      return super.hashCode();
   }

   @Override
   public String toString() {
      return "Car [height()=" + height() + ", length()=" + length() + ", make()=" + make()
            + ", model()=" + model() + "]";
   }

}

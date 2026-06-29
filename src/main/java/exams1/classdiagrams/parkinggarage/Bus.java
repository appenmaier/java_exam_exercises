package exams1.classdiagrams.parkinggarage;

/**
 * Represents a bus as a specific type of vehicle.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Bus extends Vehicle {

   /**
    * Creates a new bus with the given make, model, length, and height.
    *
    * @param make   the manufacturer of the bus
    * @param model  the model name of the bus
    * @param length the length of the bus in metres
    * @param height the height of the bus in metres
    */
   public Bus(String make, String model, double length, double height) {
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
      return "Bus [height()=" + height() + ", length()=" + length() + ", make()=" + make()
            + ", model()=" + model() + "]";
   }

}

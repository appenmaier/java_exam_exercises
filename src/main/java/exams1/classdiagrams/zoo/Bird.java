package exams1.classdiagrams.zoo;

/**
 * Represents a bird, which is an animal that can fly.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Bird extends Animal {

   /**
    * Creates a new bird with the given description, size, and weight.
    *
    * @param description the description (name) of the bird
    * @param sizeInM     the size of the bird in metres
    * @param weightInKG  the weight of the bird in kilograms
    */
   public Bird(String description, double sizeInM, double weightInKG) {
      super(description, sizeInM, weightInKG);
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

   /** Simulates the flying behaviour of this bird. */
   public void fly() {
      System.out.println("flatter, flatter");
   }

   @Override
   public int hashCode() {
      return super.hashCode();
   }

   @Override
   public String toString() {
      return "Bird [description()=" + description() + ", sizeInM()=" + sizeInM() + ", weightInKG()="
            + weightInKG() + "]";
   }

}

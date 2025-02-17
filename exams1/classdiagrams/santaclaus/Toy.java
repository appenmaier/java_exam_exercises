package exams1.classdiagrams.santaclaus;

import java.util.Objects;

/**
 * Spielzeug
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Toy extends Present {

   private final String description;
   private final double priceInEuro;

   public Toy(String description, double priceInEuro) {
      this.description = description;
      this.priceInEuro = priceInEuro;
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
      Toy other = (Toy) obj;
      return Objects.equals(description, other.description)
            && Double.doubleToLongBits(priceInEuro) == Double.doubleToLongBits(other.priceInEuro);
   }

   @Override
   public String getDescription() {
      return description;
   }

   public double getPriceInEuro() {
      return priceInEuro;
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = super.hashCode();
      result = prime * result + Objects.hash(description, priceInEuro);
      return result;
   }

   @Override
   public String toString() {
      return "Toy [description=" + description + ", priceInEuro=" + priceInEuro + "]";
   }

}

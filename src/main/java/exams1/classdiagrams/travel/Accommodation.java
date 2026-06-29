package exams1.classdiagrams.travel;

import java.util.Objects;

/**
 * Represents an accommodation booking with a name and city.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Accommodation extends AbstractBooking {

   private final String name;
   private final String city;

   /**
    * Creates a new accommodation booking with the given name, city, and price.
    *
    * @param name        the name of the accommodation
    * @param city        the city where the accommodation is located
    * @param priceInEuro the price of the accommodation in euros
    */
   public Accommodation(String name, String city, double priceInEuro) {
      super(priceInEuro);
      this.name = name;
      this.city = city;
   }

   /** Returns the name of this accommodation. */
   public String getName() {
      return name;
   }

   /** Returns the city where this accommodation is located. */
   public String getCity() {
      return city;
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = super.hashCode();
      result = prime * result + Objects.hash(city, name);
      return result;
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
      Accommodation other = (Accommodation) obj;
      return Objects.equals(city, other.city) && Objects.equals(name, other.name);
   }

   @Override
   public String toString() {
      return "Accommodation [name=" + name + ", city=" + city + "]";
   }

}

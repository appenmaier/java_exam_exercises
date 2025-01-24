package exams2.classdiagrams.cornershop;

import java.util.Objects;

/**
 * Produkt
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public abstract class Product {

   private final String description;
   private double price;
   private String currency;

   public Product(String description, double price, String currency) {
      this.description = description;
      this.price = price;
      this.currency = currency;
   }

   public String description() {
      return description;
   }

   public double getPrice() {
      return price;
   }

   public String getCurrency() {
      return currency;
   }

   @Override
   public int hashCode() {
      return Objects.hash(currency, description, price);
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
      Product other = (Product) obj;
      return Objects.equals(currency, other.currency)
            && Objects.equals(description, other.description)
            && Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
   }

   @Override
   public String toString() {
      return "Product [description=" + description + ", price=" + price + ", currency=" + currency
            + "]";
   }

}

package exams1.classdiagrams.cashiersystem;

/**
 * Represents a product with an ID, description, unit, and price in euro.
 *
 * @author Anarchiebald
 * @version 1.0
 *
 */
public class Product {

   private final String description;
   private final int id;
   private double priceInEuro;
   private String unit;

   public Product(int id, String description, String unit, double priceInEuro) {
      this.id = id;
      this.description = description;
      this.unit = unit;
      this.priceInEuro = priceInEuro;
   }

   /** Returns the description of this product. */
   public String description() {
      return description;
   }

   /** Returns the price of this product in euro. */
   public double getPriceInEuro() {
      return priceInEuro;
   }

   /** Returns the unit of measure for this product. */
   public String getUnit() {
      return unit;
   }

   /** Returns the unique identifier of this product. */
   public int id() {
      return id;
   }

   /** Sets the price of this product in euro. */
   public void setPriceInEuro(double priceInEuro) {
      this.priceInEuro = priceInEuro;
   }

   /** Sets the unit of measure for this product. */
   public void setUnit(String unit) {
      this.unit = unit;
   }

   @Override
   public String toString() {
      return "Product [id=" + id + ", description=" + description + ", unit=" + unit
            + ", priceInEuro=" + priceInEuro + "]";
   }

}

package exams1.classdiagrams.cashiersystem;

/**
 * Produkt
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

  public String description() {
    return description;
  }

  public double getPriceInEuro() {
    return priceInEuro;
  }

  public String getUnit() {
    return unit;
  }

  public int id() {
    return id;
  }

  public void setPriceInEuro(double priceInEuro) {
    this.priceInEuro = priceInEuro;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  @Override
  public String toString() {
    return "Product [id=" + id + ", description=" + description + ", unit=" + unit
        + ", priceInEuro=" + priceInEuro + "]";
  }

}

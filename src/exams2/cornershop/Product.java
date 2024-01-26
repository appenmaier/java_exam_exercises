package exams2.cornershop;

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
  private final double price;

  public Product(String description, double price) {
    this.description = description;
    this.price = price;
  }

  public String description() {
    return description;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Product other = (Product) obj;
    return Objects.equals(description, other.description)
        && Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, price);
  }

  public double price() {
    return price;
  }

  @Override
  public String toString() {
    return "Product [description=" + description + ", price=" + price + "]";
  }

}

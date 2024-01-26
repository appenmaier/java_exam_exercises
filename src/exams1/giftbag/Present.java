package exams1.giftbag;

import java.util.Objects;

/**
 * Geschenk
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Present {

  private final String description;
  private final double price;
  private final Person recipient;
  private final Person sender;

  public Present(String description, double price, Person sender, Person recipient) {
    this.description = description;
    this.price = price;
    this.sender = sender;
    this.recipient = recipient;
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
    Present other = (Present) obj;
    return Objects.equals(description, other.description)
        && Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
        && Objects.equals(recipient, other.recipient) && Objects.equals(sender, other.sender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, price, recipient, sender);
  }

  public double price() {
    return price;
  }

  public Person recipient() {
    return recipient;
  }

  public Person sender() {
    return sender;
  }

  @Override
  public String toString() {
    return "Present [description=" + description + ", price=" + price + ", recipient=" + recipient
        + ", sender=" + sender + "]";
  }

}

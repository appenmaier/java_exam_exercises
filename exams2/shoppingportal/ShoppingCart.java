package exams2.shoppingportal;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Warenkorb
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 * @param <T>
 */
public class ShoppingCart<T extends Sellable> {

  public class Item {

    private final int amount;
    private final T sellable;

    private Item(T sellable, int amount) {
      this.sellable = sellable;
      this.amount = amount;
    }

    public int amount() {
      return amount;
    }

    public double getSubTotal() {
      return sellable.price() * amount;
    }

    public T sellable() {
      return sellable;
    }

  }

  private final List<Item> items;

  public ShoppingCart() {
    items = new ArrayList<>();
  }

  public void addItem(T sellable, int amount) {
    items.add(new Item(sellable, amount));
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    @SuppressWarnings("unchecked")
    ShoppingCart<T> other = (ShoppingCart<T>) obj;
    return Objects.equals(items, other.items);
  }

  public double getTotal() {
    double total = 0;
    for (Item item : items) {
      total += item.getSubTotal();
    }
    return total;
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  public List<Item> items() {
    return items;
  }

  public void removeItem(T sellable) {
    ArrayList<Item> tmp = new ArrayList<>();
    for (Item i : items) {
      if (i.sellable.equals(sellable)) {
        tmp.add(i);
      }
    }
    items.removeAll(tmp);
  }

  @Override
  public String toString() {
    return "ShoppingCart [items=" + items + "]";
  }

}

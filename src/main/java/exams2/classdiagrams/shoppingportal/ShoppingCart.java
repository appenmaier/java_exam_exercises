package exams2.classdiagrams.shoppingportal;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents a shopping cart that holds sellable items with quantities.
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

      /**
       * Returns the quantity of the sellable item in this cart entry.
       */
      public int amount() {
         return amount;
      }

      /**
       * Returns the subtotal for this cart entry as price multiplied by quantity.
       */
      public double getSubTotal() {
         return sellable.price() * amount;
      }

      /**
       * Returns the sellable item of this cart entry.
       */
      public T sellable() {
         return sellable;
      }

   }

   private final List<Item> items;

   public ShoppingCart() {
      items = new ArrayList<>();
   }

   /**
    * Adds a new cart entry for the given sellable item with the specified quantity.
    */
   public void addItem(T sellable, int amount) {
      items.add(new Item(sellable, amount));
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
      @SuppressWarnings("unchecked")
      ShoppingCart<T> other = (ShoppingCart<T>) obj;
      return Objects.equals(items, other.items);
   }

   /**
    * Returns the sum of all subtotals in this shopping cart.
    */
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

   /**
    * Returns the list of all items currently in this shopping cart.
    */
   public List<Item> items() {
      return items;
   }

   /**
    * Removes all cart entries matching the given sellable item.
    */
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

package exams1.classdiagrams.cashiersystem;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a shopping cart that holds a list of items and calculates the total price.
 *
 * @author Anarchiebald
 * @version 1.0
 *
 */
public class ShoppingCart {

   private final List<Item> items;

   public ShoppingCart() {
      items = new ArrayList<>();
   }

   /** Creates a new item with the given goods and amount and adds it to the cart. */
   public void createItem(Goods goods, int amount) {
      items.add(new Item(goods, amount));
   }

   /** Returns the total price in euro of all items in the cart. */
   public double getTotalInEuro() {
      double sum = 0;
      for (Item i : items) {
         sum += i.getSubTotalInEuro();
      }
      return sum;
   }

   /** Returns the list of items currently in the shopping cart. */
   public List<Item> items() {
      return items;
   }

   @Override
   public String toString() {
      return "ShoppingCart [items=" + items + "]";
   }

}

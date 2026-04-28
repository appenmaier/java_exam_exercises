package exams1.classdiagrams.cashiersystem;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Manages a point-of-sale system including goods, cashiers, and shopping carts.
 *
 * @author Anarchiebald
 * @version 1.0
 *
 */
public class CashierSystem {

   private Cashier cashier;
   private final List<Cashier> cashiers;
   private final List<Goods> goods;
   private final String name;
   private ShoppingCart shoppingCart;

   public CashierSystem(String name) {
      this.name = name;
      goods = new ArrayList<>();
      cashiers = new ArrayList<>();
   }

   /** Sets the active cashier for the current session. */
   public void addCashier(Cashier cashier) {
      this.cashier = cashier;
   }

   /** Adds a goods item to the catalogue of available products. */
   public void addGoods(Goods goods) {
      this.goods.add(goods);
   }

   /** Adds the specified amount of the goods identified by the given ID to the current shopping cart. */
   public void addItem(int id, int amount) {
      for (Goods g : goods) {
         if (g.id() == id) {
            shoppingCart.createItem(g, amount);
         }
      }
   }

   /** Creates a new empty shopping cart for the current transaction. */
   public void createShoppingCart() {
      shoppingCart = new ShoppingCart();
   }

   /** Logs in the cashier with the given ID as the active cashier. */
   public void login(int id) {
      for (Cashier c : cashiers) {
         if (c.id() == id) {
            cashier = c;
         }
      }
   }

   /** Prints a formatted receipt for the current shopping cart to standard output. */
   public void printBon() {
      NumberFormat formatter = new DecimalFormat("0.00");

      String result = "Kassenzettel\n";
      for (Item i : shoppingCart.items()) {
         result += "\n" + i.getAmount() + " " + i.goods().getUnit() + " " + i.goods().description()
               + ": " + formatter.format(i.getSubTotalInEuro()) + " Euro";
      }
      result += "\n\nGesamtpreis: " + formatter.format(shoppingCart.getTotalInEuro()) + " Euro"
            + "\n\nVielen Dank für Ihren Einkauf bei " + name;
      result += "\n\nEs biente Sie " + cashier.name();
      result += "\n" + LocalDateTime.now();
      System.out.println(result);
   }

   @Override
   public String toString() {
      return "CashierSystem [name=" + name + ", goods=" + goods + ", cashiers=" + cashiers
            + ", shoppingCart=" + shoppingCart + ", cashier=" + cashier + ']';
   }

}

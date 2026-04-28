package exams1.classdiagrams.cashiersystem;

/**
 * Represents a line item in a shopping cart, combining a goods reference with a quantity.
 *
 * @author Anarchiebald
 * @version 1.0
 *
 */
public class Item {

   private int amount;
   private final Goods goods;

   public Item(Goods goods, int amount) {
      this.goods = goods;
      this.amount = amount;
   }

   /** Returns the quantity of goods in this item. */
   public int getAmount() {
      return amount;
   }

   /** Returns the subtotal in euro for this item (price per unit multiplied by quantity). */
   public double getSubTotalInEuro() {
      return amount * goods.getPriceInEuro();
   }

   /** Returns the goods associated with this item. */
   public Goods goods() {
      return goods;
   }

   /** Sets the quantity of goods in this item. */
   public void setAmount(int amount) {
      this.amount = amount;
   }

   @Override
   public String toString() {
      return "Item [goods=" + goods + ", amount=" + amount + "]";
   }

}

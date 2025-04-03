package exams1.classdiagrams.cashiersystem;

/**
 * MainClass
 *
 * @author Anarchiebald
 * @version 1.0
 *
 */
public class MainClass {

   public static void main(String[] args) {

      CashierSystem kaufland = new CashierSystem("Kaufland");

      kaufland.addCashier(new Cashier(1, "Lisa Schmid"));
      kaufland.addCashier(new Cashier(2, "Alfredo Torreto"));
      kaufland.login(2);

      kaufland.addGoods(new Goods(1, "Tomaten", "kg", 5.59, ClassOfGoods.VEGETABLES));
      kaufland.addGoods(new Goods(2, "Milch", "l", 2.39, ClassOfGoods.DAIRY_PRODUCTS));
      kaufland.addGoods(new Goods(3, "Pasta", "kg", 2.19, ClassOfGoods.BAKERY_PRODUCTS));
      kaufland.addGoods(new Goods(4, "Knoppers", "Stueck", 1.49, ClassOfGoods.BAKERY_PRODUCTS));

      kaufland.createShoppingCart();

      kaufland.addItem(1, 1);
      kaufland.addItem(2, 5);
      kaufland.addItem(3, 2);
      kaufland.addItem(4, 12);

      kaufland.printBon();

   }

}

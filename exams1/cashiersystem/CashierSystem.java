package exams1.cashiersystem;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Kassensystem
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

  public void addCashier(Cashier cashier) {
    this.cashier = cashier;
  }

  public void addGoods(Goods goods) {
    this.goods.add(goods);
  }

  public void addItem(int id, int amount) {
    for (Goods g : goods) {
      if (g.id() == id) {
        shoppingCart.createItem(g, amount);
      }
    }
  }

  public void createShoppingCart() {
    shoppingCart = new ShoppingCart();
  }

  public void login(int id) {
    for (Cashier c : cashiers) {
      if (c.id() == id) {
        cashier = c;
      }
    }
  }

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

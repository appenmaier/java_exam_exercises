package exams1.classdiagrams.cashiersystem;

/**
 * Eintrag
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

  public int getAmount() {
    return amount;
  }

  public double getSubTotalInEuro() {
    return amount * goods.getPriceInEuro();
  }

  public Goods goods() {
    return goods;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  @Override
  public String toString() {
    return "Item [goods=" + goods + ", amount=" + amount + "]";
  }

}

package exams1.cashiersystem;

public class Item {
    private final Goods goods;
    private int amount;
    public Item(Goods goods, int amount) {
        this.goods = goods;
        this.amount = amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public double getSubTotalInEuro() {
        return amount * goods.getPriceInEuro();
    }
    public int getAmount() {
        return amount;
    }
    public Goods goods() {
        return goods;
    }
    @Override
    public String toString() {
        return "Item [goods=" + goods + ", amount=" + amount + "]";
    }
}

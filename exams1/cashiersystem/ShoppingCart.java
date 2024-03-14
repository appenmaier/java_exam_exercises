package exams1.cashiersystem;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Item> items;
    public ShoppingCart() {
        items = new ArrayList<>();
    }
    public void createItem(Goods goods, int amount) {
        items.add(new Item(goods, amount));
    }
    public double getTotalInEuro() {
        double sum = 0;
        for (Item i : items) {
            sum += i.getSubTotalInEuro();
        }
        return sum;
    }
    public List<Item> items() {
        return items;
    }
    @Override
    public String toString() {
        String result = "ShoppingCart [items=";
        for (Item i : items) {
            result += i;
        }
        result += "]";
        return result;
    }
}

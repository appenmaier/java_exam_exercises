package exams1.cashiersystem;

import java.util.ArrayList;
import java.util.List;

public class CashierSystem {
    private final String name;
    private final List<Goods> goods;
    private final List<Cashier> cashiers;
    private ShoppingCart shoppingCart;
    private Cashier cashier;
    public CashierSystem(String name) {
        this.name = name;
        goods = new ArrayList<>();
        cashiers = new ArrayList<>();
    }
    public void addGoods(Goods goods) {
        this.goods.add(goods);
    }
    public void addCashier(Cashier cashier) {
        this.cashier = cashier;
    }
    public void login(int id) {
        for (Cashier c : cashiers) {
            if (c.id() == id) {
                cashier = c;
            }
        }
    }
    public void createShoppingCart() {
        shoppingCart = new ShoppingCart();
    }
    public void addItem(int id, int amount) {
        for (Goods g : goods) {
            if (g.id() == id) {
                shoppingCart.createItem(g, amount);
            }
        }
    }
    public void printBon() {
        String result = "Bon CashierSystem: " + name;
        for (Item i : shoppingCart.items()) {
            result += "\n" + i.getAmount() + " " + i.goods().description() + " -> price: " + i.getSubTotalInEuro();
        }
        result += "\nTotal price: " + shoppingCart.getTotalInEuro() + "\nVielen Dank für Ihren Einkauf bei " + name + "!";
        System.out.println(result);
    }
}

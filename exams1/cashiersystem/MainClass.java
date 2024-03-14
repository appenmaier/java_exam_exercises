package exams1.cashiersystem;

public class MainClass {
    public static void main(String[] args) {
        CashierSystem kaufland = new CashierSystem("Kaufland");

        kaufland.addCashier(new Cashier(1, "Lisa"));
        kaufland.addCashier(new Cashier(2, "Alfredo"));
        kaufland.login(2);

        kaufland.addGoods(new Goods(1, "Tomaten", "Kg", 5.59, ClassOfGoods.VEGETABLES));
        kaufland.addGoods(new Goods(2, "Milk", "gallon", 2.39, ClassOfGoods.DAIRY_PRODUCTS));
        kaufland.addGoods(new Goods(3, "Pasta", "Kg", 2.19, ClassOfGoods.BAKERY_PRODUCTS));
        kaufland.addGoods(new Goods(4, "Knoppers", "Kg", 1.49, ClassOfGoods.BAKERY_PRODUCTS));

        kaufland.createShoppingCart();

        kaufland.addItem(1, 34);
        kaufland.addItem(2, 10);
        kaufland.addItem(3, 4);
        kaufland.addItem(4, 1);

        kaufland.printBon();
    }
}

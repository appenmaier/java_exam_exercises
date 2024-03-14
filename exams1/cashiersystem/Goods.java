package exams1.cashiersystem;

public class Goods extends Product{
    private final ClassOfGoods classOfGoods;
    public Goods(int id, String description, String unit, double priceInEuro, ClassOfGoods classOfGoods) {
        super(id, description, unit, priceInEuro);
        this.classOfGoods = classOfGoods;
    }
    public ClassOfGoods classOfGoods() {
        return classOfGoods;
    }
    public String toString() {
        return "Goods [id=" + id() + ", description=" + description() + ", unit=" + getUnit() + ", priceInEuro=" + getPriceInEuro() + ", classOfGoods=" + classOfGoods + "]";
    }
}

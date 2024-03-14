package exams1.cashiersystem;

public class Product {
    private final int id;
    private final String description;
    private String unit;
    private double priceInEuro;
    public Product(int id, String description, String unit, double priceInEuro) {
        this.id = id;
        this.description = description;
        this.unit = unit;
        this.priceInEuro = priceInEuro;
    }
    public void setPriceInEuro(double priceInEuro) {
        this.priceInEuro = priceInEuro;
    }
    public int id() {
        return id;
    }
    public String description() {
        return description;
    }
    public String getUnit() {
        return unit;
    }
    public void setUnit(String unit) {
        this.unit = unit;
    }
    public double getPriceInEuro() {
        return priceInEuro;
    }
    @Override
    public String toString() {
        return "Product [id=" + id + ", description=" + description + ", unit=" + unit + ", priceInEuro=" + priceInEuro + "]";
    }

}

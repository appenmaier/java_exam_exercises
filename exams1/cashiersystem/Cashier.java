package exams1.cashiersystem;

public class Cashier {
    private final int id;
    private final String name;
    public Cashier(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public String name() {
        return name;
    }
    public int id() {
        return id;
    }
    @Override
    public String toString() {
        return "Cashier [id=" + id + ", name=" + name + "]";
    }
}

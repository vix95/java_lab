@SuppressWarnings("WeakerAccess")
public class Product {
    private String name;
    private int quantity;
    private double net;
    private double totalNet;
    private double vatTax;
    private double gross;

    private Product() {
    }

    public Product(String name, int quantity, double net, double vatTax) {
        this();
        this.name = name;
        this.quantity = quantity;
        this.net = net;
        this.totalNet = calcTotalNet();
        this.vatTax = vatTax;
        this.gross = calcGross();
    }

    private double calcTotalNet() {
        return Math.round(net * quantity * 100.0) / 100.0;
    }

    private double calcGross() {
        return Math.round((totalNet * (1 + vatTax)) * 100.0) / 100.0;
    }

    public double getGross() {
        return gross;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", net=" + net +
                ", totalNet=" + totalNet +
                ", vatTax=" + vatTax +
                ", gross=" + gross +
                '}';
    }
}

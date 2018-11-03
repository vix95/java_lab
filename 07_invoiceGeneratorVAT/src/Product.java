@SuppressWarnings("WeakerAccess")
public class Product {
    private String name;
    private int quantity;
    private double netto;
    private double totalNetto;
    private double vatTax;
    private double totalBrutto;

    private Product() {
    }

    public Product(String name, int quantity, double netto, double vatTax) {
        this();
        this.name = name;
        this.quantity = quantity;
        this.netto = netto;
        this.totalNetto = calcTotalNetto();
        this.vatTax = vatTax;
        this.totalBrutto = calcTotalBrutto();
    }

    private double calcTotalNetto() {
        return Math.round(netto * quantity * 100.0) / 100.0;
    }

    private double calcTotalBrutto() {
        return Math.round((totalNetto * (1 + vatTax)) * 100.0) / 100.0;
    }

    public double getTotalBrutto() {
        return totalBrutto;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", netto=" + netto +
                ", totalNetto=" + totalNetto +
                ", vatTax=" + vatTax +
                ", totalBrutto=" + totalBrutto +
                '}';
    }
}

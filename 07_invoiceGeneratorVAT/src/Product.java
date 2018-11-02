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
        this.name = name;
        this.quantity = quantity;
        this.netto = netto;
        this.totalNetto = totalNetto;
        this.vatTax = vatTax;
        this.totalBrutto = totalBrutto;
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

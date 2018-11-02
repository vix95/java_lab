@SuppressWarnings("WeakerAccess")
public class InvoiceItem {
    private Product product;

    InvoiceItem() {
    }

    public InvoiceItem(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "InvoiceItem{" +
                "product=" + product +
                '}';
    }
}

import java.util.ArrayList;

@SuppressWarnings("WeakerAccess")
public class InvoiceSystem {
    private ArrayList<InvoiceVat> invoices = new ArrayList<>();

    public InvoiceSystem() {
    }

    public InvoiceSystem addInvoice(Product product) {
        //invoices.add(new InvoiceVat(product));
        return this;
    }

    @Override
    public String toString() {
        return "\nInvoiceSystem{" +
                "invoices=" + invoices +
                '}';
    }
}

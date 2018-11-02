import java.util.ArrayList;

@SuppressWarnings("WeakerAccess")
public class InvoiceSystem {
    private ArrayList<InvoiceVat> invoices = new ArrayList<>();

    public InvoiceSystem() {
    }

    public InvoiceSystem addInvoice(InvoiceVat invoice) {
        invoices.add(invoice);
        return this;
    }

    @Override
    public String toString() {
        return "InvoiceSystem{" +
                "invoices=" + invoices +
                '}';
    }
}

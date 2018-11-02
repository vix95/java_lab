import java.util.ArrayList;

@SuppressWarnings("WeakerAccess")
public class InvoiceSystem {
    private ArrayList<InvoiceVat> invoices = new ArrayList<>();

    public InvoiceSystem() {
    }

    public InvoiceSystem addInvoice(Product product, Company company) {
        invoices.add(new InvoiceVat().addProduct(product)
                .addCompany(company));
        return this;
    }

    @Override
    public String toString() {
        return "\nInvoiceSystem{" +
                "invoices=" + invoices +
                '}';
    }
}

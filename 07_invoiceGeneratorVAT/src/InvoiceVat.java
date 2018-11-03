import java.util.ArrayList;
import java.util.Date;

@SuppressWarnings("WeakerAccess")
public class InvoiceVat {
    private ArrayList<InvoiceItem> items = new ArrayList<>();
    private double totalBrutto;
    private Company company;
    private int vatInvoiceNumber;
    private Date dateOfIssue;
    private Date dateOfSale;
    private Date dateOfPayment;

    public InvoiceVat() {
    }

    public InvoiceVat addProduct(Product product) {
        items.add(new InvoiceItem(product));
        this.totalBrutto = calcTotalBrutto();
        return this;
    }

    public InvoiceVat addCompany(Company company) {
        this.company = company;
        return this;
    }

    private double calcTotalBrutto() {
        double brutto = 0;
        for (InvoiceItem item : items) brutto += item.getProduct().getTotalBrutto();
        return brutto;
    }

    @Override
    public String toString() {
        return "\n\t\tInvoiceVat{" +
                "items=" + items +
                ", \n\t\t\t\ttotalBrutto=" + totalBrutto +
                ", \n\t\t\t\tcompany=" + company +
                ", \n\t\t\t\tvatInvoiceNumber='" + vatInvoiceNumber + '\'' +
                ", \n\t\t\t\tdateOfIssue=" + dateOfIssue +
                ", \n\t\t\t\tdateOfSale=" + dateOfSale +
                ", \n\t\t\t\tdateOfPayment=" + dateOfPayment +
                '}';
    }
}

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
        return "\n\tInvoiceVat{" +
                "\n\t\t\titems=" + items +
                ", \n\t\t\ttotalBrutto=" + totalBrutto +
                ", \n\t\t\tcompany=" + company +
                ", vatInvoiceNumber='" + vatInvoiceNumber + '\'' +
                ", dateOfIssue=" + dateOfIssue +
                ", dateOfSale=" + dateOfSale +
                ", dateOfPayment=" + dateOfPayment +
                '}';
    }
}

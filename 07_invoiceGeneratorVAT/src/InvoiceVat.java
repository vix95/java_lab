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

    public InvoiceVat(ArrayList<InvoiceItem> items, Company company,
                      Date dateOfIssue, Date dateOfSale, Date dateOfPayment) {
        this.items = items;
        this.totalBrutto = brutto;
        this.company = company;
        this.vatInvoiceNumber = hashCode();
        this.dateOfIssue = dateOfIssue;
        this.dateOfSale = dateOfSale;
        this.dateOfPayment = dateOfPayment;
    }

    @Override
    public String toString() {
        return "InvoiceVat{" +
                "items=" + items +
                ", totalBrutto=" + totalBrutto +
                ", company=" + company +
                ", vatInvoiceNumber='" + vatInvoiceNumber + '\'' +
                ", dateOfIssue=" + dateOfIssue +
                ", dateOfSale=" + dateOfSale +
                ", dateOfPayment=" + dateOfPayment +
                '}';
    }
}

public class invoiceGenerator {
    public static void main(String[] args) {
        InvoiceSystem system = new InvoiceSystem();
        system.addInvoice(new Product("Apple", 10, 2.59, 0.23),
                new Company("Sunrise Titanic", "856-188-45-49", "PL83 1010 1023 0000 2613 9510 0000"));

        // new Address("975 Trails End Road", "Fort Lauderdale", "Florida",
        //                                "33308", "USA")

        System.out.println(system);
    }
}

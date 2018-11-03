public class invoiceGenerator {
    public static void main(String[] args) {
        InvoiceSystem system = new InvoiceSystem();
        system.addInvoice(new InvoiceVat()
                .addProduct(new Product("Apple", 10, 2.59, 0.23))
                .addProduct(new Product("Apple", 10, 2.59, 0.23))
                .addProduct(new Product("Apple", 10, 2.59, 0.23))
                .addCompany(new Company("Sunrise Titanic",  "856-188-45-49", "PL83 1010 1023 0000 2613 9510 0000")
                        .addAddress(new Address("975 Trails End Road", "Fort Lauderdale", "Florida", "34436", "USA"))))

                .addInvoice(new InvoiceVat()
                        .addProduct(new Product("Apple", 10, 2.59, 0.23))
                        .addProduct(new Product("Apple", 10, 2.59, 0.23))
                        .addProduct(new Product("Apple", 10, 2.59, 0.23))
                        .addCompany(new Company("Sunrise Titanic",  "856-188-45-49", "PL83 1010 1023 0000 2613 9510 0000")
                                .addAddress(new Address("975 Trails End Road", "Fort Lauderdale", "Florida", "34436", "USA"))));

        System.out.println(system);
    }
}

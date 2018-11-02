@SuppressWarnings("WeakerAccess")
public class Company {
    private String firmName;
    private Address address;
    private String nip;
    private String bankAccountNumber;

    public Company(String firmName, Address address, String nip, String bankAccountNumber) {
        this.firmName = firmName;
        this.address = address;
        this.nip = nip;
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public String toString() {
        return "Company{" +
                "firmName='" + firmName + '\'' +
                ", address=" + address +
                ", nip='" + nip + '\'' +
                ", bankAccountNumber='" + bankAccountNumber + '\'' +
                '}';
    }
}

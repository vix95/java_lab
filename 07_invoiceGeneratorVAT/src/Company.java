@SuppressWarnings("WeakerAccess")
public class Company {
    private String companyName;
    //private Address address;
    private String nip;
    private String bankAccountNumber;

    Company() {
    }

    public Company(String companyName, String nip, String bankAccountNumber) {
        this.companyName = companyName;
        this.nip = nip;
        this.bankAccountNumber = bankAccountNumber;
    }

    public Company addAddress(String companyName, String nip, String bankAccountNumber) {
        this.companyName = companyName;
        //this.address = address;
        this.nip = nip;
        this.bankAccountNumber = bankAccountNumber;
        return this;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                //", address=" + address +
                ", nip='" + nip + '\'' +
                ", bankAccountNumber='" + bankAccountNumber + '\'' +
                '}';
    }
}

import java.util.Date;

@SuppressWarnings("WeakerAccess")
public class LoanApplication {
    private String firstName;
    private String surname;
    private String pesel;
    private String nip;
    private String bankAccountNumber;
    private Date dateOfBirth;
    private enum gender{MALE, FEMALE};

    public LoanApplication() {
    }

    public LoanApplication(String firstName, String surname, String pesel, String nip, String bankAccountNumber, Date dateOfBirth) {
        this.firstName = firstName;
        this.surname = surname;
        this.pesel = pesel;
        this.nip = nip;
        this.bankAccountNumber = bankAccountNumber;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "LoanApplication{" +
                "firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", pesel='" + pesel + '\'' +
                ", nip='" + nip + '\'' +
                ", bankAccountNumber='" + bankAccountNumber + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}

@SuppressWarnings("WeakerAccess")
public class Address {
    private String street;
    private String houseNumber;
    private String city;
    private String region;
    private String postalCode;
    private String country;

    public Address(String street, String houseNumber, String city, String region, String postalCode, String country) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.city = city;
        this.region = region;
        this.postalCode = postalCode;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", city='" + city + '\'' +
                ", region='" + region + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

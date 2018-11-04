@SuppressWarnings("WeakerAccess")
public class Person {
    public String firstName;
    public String surname;
    public int yearOfBirth;
    public String gender;

    Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", gender='" + gender + '\'' +
                '}';
    }
}

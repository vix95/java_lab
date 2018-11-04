@SuppressWarnings("WeakerAccess")
public class Student extends Person {
    private int indexNumber;

    Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "indexNumber=" + indexNumber +
                '}';
    }
}

public class GenderValidate {
    private String gender;
    private boolean isCorrect;

    public GenderValidate(String gender, String pesel) {
        this.gender = gender;
        this.isCorrect = Validate(pesel);
    }

    private boolean Validate(String pesel) {
        return checkGender(pesel);
    }

    private int getGenderFromPesel(String pesel) {
        return Integer.parseInt(pesel.substring(9, 10));
    }

    private boolean checkGender(String pesel) {

    }

    @Override
    public String toString() {
        return "GenderValidate{" +
                "gender='" + gender + '\'' +
                ", isCorrect='" + isCorrect + '\'' +
                '}';
    }
}

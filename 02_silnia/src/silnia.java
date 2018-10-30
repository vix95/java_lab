public class silnia {
    public static void main(String[] args) {
        int silnia = 10;
        long result = 1;
        System.out.println("Obliczanie silni z " + silnia);
        for (int i = 0; i < silnia; i++) {
            result = result * (i + 1);
            System.out.println(result);
        }
    }
}

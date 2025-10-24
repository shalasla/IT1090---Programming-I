import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name = SafeInput.getNonZeroLenString(in, "Enter your name");
        int age = SafeInput.getInt(in, "Enter your age");
        double price = SafeInput.getDouble(in, "Enter a price");
        int rating = SafeInput.getRangedInt(in, "Rate 1-5", 1, 5);
        double score = SafeInput.getRangedDouble(in, "Score 0.0-10.0", 0.0, 10.0);
        boolean confirm = SafeInput.getYNConfirm(in, "Continue?");
        String zip = SafeInput.getRegExString(in, "ZIP", "\\d{5}");
        SafeInput.prettyHeader("Welcome to Lab 08!");
    }
}